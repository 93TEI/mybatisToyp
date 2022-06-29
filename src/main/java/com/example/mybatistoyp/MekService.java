package com.example.mybatistoyp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MekService {

    @Autowired
    private MekDAO MEKDAO;

    public String getUser(){
        return MEKDAO.selectUser();
    }

    public String postUser(String name) {
        MEKDAO.createUser(name);
        return "유저 저장 완료";
    }
}
