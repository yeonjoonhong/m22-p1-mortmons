package com.nighthawk.csa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EightBall {
    @GetMapping("/eightball")
    public String eight_ball(Model model) {
        String[] choices = {"Yes", "No"};
        String choice = choices[(int)(Math.random() * 2)];

        model.addAttribute("choice", choice);
        return "eightball";
    }


}
