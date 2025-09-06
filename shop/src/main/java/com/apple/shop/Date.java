package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;


@Controller
public class Date {
    @GetMapping("/date")
    @ResponseBody
    String DateTime () {
        return LocalDateTime.now().toString();
    }
}
