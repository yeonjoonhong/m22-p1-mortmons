package com.nighthawk.csa;
/*
This project was made by altering "Greet" from the spring_portfolio
I changed variables to make them stand out and be more meaningful, instead of everything being called 'name'
Hopefully this code is easier to read!
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class questionnaireController {

    @GetMapping("/Questionnaire")
    public String aboutArch() {
        return "Questionnaire";
    }
}