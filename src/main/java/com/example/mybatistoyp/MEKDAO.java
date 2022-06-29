package com.example.mybatistoyp;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MEKDAO {

    String selectUser();

    void createUser();
}
