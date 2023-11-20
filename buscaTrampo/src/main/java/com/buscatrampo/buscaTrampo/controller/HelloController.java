package com.buscatrampo.buscaTrampo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lincoln
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String olaMundo(){
        return "hello world";
    }
}
