package com.broduck.enigma.service;

import com.broduck.enigma.dao.CategoryDao;
import com.broduck.enigma.generate.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 투표 서비스
 * Created by broduck on 2017. 4. 24..
 */
@Service
public class VoteService {
    @Autowired
    private CategoryDao categoryDao;

    public boolean generateVoteData() {
        categoryDao.generateCategory();

        return true;
    }

    public List<Category> readVoteKindList() {
        return categoryDao.selectList();
    }
}
