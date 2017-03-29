package com.broduck.enigma.dao;

import java.util.List;

/**
 * Dao Interface
 * Created by ydh0624 on 2017-03-29.
 */
public interface IDataBase<T> {

    boolean insert(T data);
    boolean insertList(List<T> list);

    boolean update(T data);
    boolean updateList(List<T> list);
}
