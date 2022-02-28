package com.nighthawk.csa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //controller for search
public class search {

    @GetMapping("/search")
    public String aboutArch() {
        return "search";
    }
}