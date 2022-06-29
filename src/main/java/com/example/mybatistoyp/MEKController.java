package com.example.mybatistoyp;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MEKController {
    private final MEKService MEKService;

    @GetMapping("/")
    public String home(){
        return MEKService.getUser();
    }

    @GetMapping("/post")
    public String post(){
        return MEKService.postUser();
    }
}
