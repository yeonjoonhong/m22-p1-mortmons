package com.nighthawk.csa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller

public class square {
    @GetMapping("/square")
    public String square() {
        return "square";
    }
}

