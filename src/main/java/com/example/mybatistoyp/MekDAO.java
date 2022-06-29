package com.example.mybatistoyp;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MekDAO {

    String selectUser();

    void createUser(String name);
}
