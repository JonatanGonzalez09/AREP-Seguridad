package edu.escuelaing.arep.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class SecureController {
    @GetMapping("index")
    public String index(){
        return "index";
    }
    @GetMapping("admin")
    public String admin(){
        return "admin/index";
    }
}