package at.cb.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/register")
    public String registerGet(){
      return "register";
    }
}
