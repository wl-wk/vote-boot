package com.grk.dao;

import org.apache.ibatis.annotations.Param;

public interface ItemDao {

    int selectCountByVoid(@Param("uid") Integer uid, @Param("vsId") Integer vsId);

    void insertItem(@Param("uid") Integer uid, @Param("vsId") Integer vsId, @Param("voIds") Integer[] voIds);

}
