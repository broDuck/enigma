package com.broduck.enigma.dao;

import com.broduck.enigma.generate.dao.CategoryMapper;
import com.broduck.enigma.generate.model.Category;
import com.broduck.enigma.generate.model.CategoryExample;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
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
}
