package com.kripesh.springboottutorial.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public String hello(Model model) {

        List<String> data = Arrays.asList("Sut", "But", "Kut", "Lut", "Gut");
        data.forEach(e -> logger.debug("Each Element: {}", e));
        logger.debug("Hello from Logback {}", data);
        model.addAttribute("name", data);

        return "index";
    }
}
