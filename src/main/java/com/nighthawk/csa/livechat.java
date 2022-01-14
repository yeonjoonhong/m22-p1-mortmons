package com.nighthawk.csa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class livechat {
    @GetMapping("/livechat")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String interviewB() {
        return "livechat"; // returns HTML VIEW (greeting)
    }

}

