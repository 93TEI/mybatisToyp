package com.example.mybatistoyp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MEKService {

    @Autowired
    private MEKDAO MEKDAO;

    public String getUser(){
        return MEKDAO.selectUser();
    }

    public String postUser() {
        MEKDAO.createUser();
        return "유저 저장 완료";
    }
}
