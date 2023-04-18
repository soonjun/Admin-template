package com.soonjun.basicboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/components")
public class ComponentController {

    @GetMapping("/buttons")
    public String buttonsPage() {
        return "/components/buttons";
    }

    @GetMapping("/cards")
    public String cardsPage() {
        return "/components/cards";
    }

}
