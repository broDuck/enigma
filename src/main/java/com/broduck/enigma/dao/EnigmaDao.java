package com.broduck.enigma.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * 최상위 Dao
 * Created by ydh0624 on 2017-03-29.
 */
public class EnigmaDao {
    @Autowired
    @Resource(name="sqlSession")
    protected SqlSession sqlSession;
}
