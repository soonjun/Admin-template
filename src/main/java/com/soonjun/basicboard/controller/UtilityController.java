package com.soonjun.basicboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/utilities")
public class UtilityController {

    @GetMapping("/colors")
    public String colorsPage() {
        return "/utilities/utilities-color";
    }

    @GetMapping("/borders")
    public String bordersPage() {
        return "/utilities/utilities-border";
    }

    @GetMapping("/animations")
    public String animationsPage() {
        return "/utilities/utilities-animation";
    }

    @GetMapping("/other")
    public String otherPage() {
        return "/utilities/utilities-other";
    }

}
