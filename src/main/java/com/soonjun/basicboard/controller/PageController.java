package com.soonjun.basicboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages")
public class PageController {

    @GetMapping("/login")
    public String loginPage() {
        return "/pages/login";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "/pages/register";
    }

    @GetMapping("/forgot-password")
    public String forgotPasswordPage() {
        return "/pages/forgot-password";
    }

    @GetMapping("/error")
    public String errorPage() {
        return "/pages/404";
    }

    @GetMapping("/blank")
    public String blankPage() {
        return "/pages/blank";
    }

}
