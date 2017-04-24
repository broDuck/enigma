package com.broduck.enigma.dao;

import com.broduck.enigma.generate.dao.CategoryMapper;
import com.broduck.enigma.generate.model.Category;
import com.broduck.enigma.generate.model.CategoryExample;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Category Dao
 * Created by ydh0624 on 2017-03-29.
 */
@Component
public class CategoryDao extends EnigmaDao implements IDataBase<Category> {

    protected CategoryMapper mapper = null;

    @PostConstruct
    protected void initialize() {
        mapper = sqlSession.getMapper(CategoryMapper.class);
    }

    @Override
    public boolean insert(Category data) {
        return mapper.insert(data) > 0;
    }

    @Override
    public boolean insertList(List<Category> list) {
        for (Category data : list) {
            if (!insert(data))
                return false;
        }

        return true;
    }

    @Override
    public boolean update(Category data) {
        CategoryExample example = new CategoryExample();
        example.createCriteria()
                .andCategorySnEqualTo(data.getCategorySn());

        return mapper.updateByExample(data, example) > 0;
    }

    @Override
    public boolean updateList(List<Category> list) {
        for (Category data : list) {
            if (!update(data))
                return false;
        }
        
        return true;
    }

    public boolean generateCategory() {
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(makeCategory("연애/사랑"));
        categoryList.add(makeCategory("패션/쇼핑/뷰티"));
        categoryList.add(makeCategory("음식/맛집"));
        categoryList.add(makeCategory("술/담배/커피"));
        categoryList.add(makeCategory("육아/교육"));
        categoryList.add(makeCategory("재테크"));
        categoryList.add(makeCategory("자동차"));
        categoryList.add(makeCategory("스포츠"));
        categoryList.add(makeCategory("여행/레저"));
        categoryList.add(makeCategory("경제/사회"));
        categoryList.add(makeCategory("정치"));
        categoryList.add(makeCategory("연예"));
        categoryList.add(makeCategory("문화/공연"));

        for (Category data : categoryList) {
            insert(data);
        }

        return true;
    }

    private Category makeCategory(String categoryName) {
        Category category = new Category();
        category.setCategoryName(categoryName);

        return category;
    }

    public List<Category> selectList() {
        CategoryExample example = new CategoryExample();
        example.createCriteria();

        return mapper.selectByExample(example);
    }
}
