package org.goldius.playground.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("ft")
    public String firstTest() {
        return "OK";
    }
}
