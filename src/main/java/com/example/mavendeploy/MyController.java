package com.example.mavendeploy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("/")
    public String greeting(@RequestParam(name="message", required=false, defaultValue="Assalamu alaikum") String message, Model model) {
        model.addAttribute("message", message);
        return "index";
    }

}