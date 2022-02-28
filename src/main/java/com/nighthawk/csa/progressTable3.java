package com.nighthawk.csa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class progressTable3 {

    @GetMapping("/progressTable3")
    public String aboutArch() {
        return "progressTable3";
    }
}