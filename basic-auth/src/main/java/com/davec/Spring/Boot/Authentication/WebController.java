package com.davec.Spring.Boot.Authentication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "That's pretty basic!";
    }

}