package com.broduck.enigma.controller.rqrs;

import com.broduck.enigma.generate.model.Category;

import java.util.List;

/**
 * 투표종류
 * Created by broduck on 2017. 4. 24..
 */
public class ReadCategoryListRs extends VoteControllerRs {
    private List<Category> categoryList;

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }
}
