package com.techub.techub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    /***
     *  returns welcome
     * @return
     */
    @GetMapping("/welcome")
    public String sayWelcome(){
        StringBuilder sb = new StringBuilder();
        return sb.append("Welcome to our first spring app").toString();
    }
}
