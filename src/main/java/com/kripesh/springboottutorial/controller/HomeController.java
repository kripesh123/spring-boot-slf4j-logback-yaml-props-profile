package com.kripesh.springboottutorial.controller;

import com.kripesh.springboottutorial.BusinessProperties;
import com.kripesh.springboottutorial.GlobalProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private BusinessProperties businessProperties;

    @Autowired
    private GlobalProperties globalProperties;

    @GetMapping("/")
    public String hello(Model model) {

        logger.debug("Business Properties {}", businessProperties);
        logger.debug("Global Properties {}", globalProperties);
        model.addAttribute("business", businessProperties);
        model.addAttribute("global", globalProperties);
        return "index";
    }
}
