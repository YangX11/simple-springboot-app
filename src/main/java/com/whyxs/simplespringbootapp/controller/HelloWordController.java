package com.whyxs.simplespringbootapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWordController {

    @RequestMapping({"/","/index"})
    public String index(){
        return "Hello Word!";
    }
}
