package com.example.mybatistoyp;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MekController {
    private final MekService MEKService;

    @GetMapping("/")
    public String home(){
        return MEKService.getUser();
    }

    @GetMapping("/post")
    public String post(@RequestParam(value = "name")String name){
        return MEKService.postUser(name);
    }
}
