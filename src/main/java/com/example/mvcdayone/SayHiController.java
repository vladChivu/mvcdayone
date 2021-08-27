package com.example.mvcdayone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SayHiController {

    @GetMapping("/say-hi")
    public String sayHi(@RequestParam(name="msg", required = false) String msg, Model model) {
        String message = msg!= null ? msg : "Hi class!";
        model.addAttribute("msg", message);
        return "say-hi";
    }
}
