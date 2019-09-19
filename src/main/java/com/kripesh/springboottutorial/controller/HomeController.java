package com.kripesh.springboottutorial.controller;

import com.kripesh.springboottutorial.config.ServerProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private ServerProperties serverProperties;

    @GetMapping("/")
    public String hello(Model model) {

        logger.debug("Server Properties {}", serverProperties);
        model.addAttribute("server", serverProperties);
        return "index";
    }
}
