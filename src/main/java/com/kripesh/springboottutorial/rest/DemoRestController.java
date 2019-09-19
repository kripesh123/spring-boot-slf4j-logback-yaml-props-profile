package com.kripesh.springboottutorial.rest;

import com.kripesh.springboottutorial.config.ServerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;

@RestController
@RequestMapping("/api/v1")
public class DemoRestController {

    @Autowired
    private ServerProperties serverProperties;

    @GetMapping("/demo")
    public ResponseEntity home(){
        return ResponseEntity.ok(Arrays.asList("Sul", "Jul", "Mul"));
    }

    @GetMapping("/serverProps")
    public ResponseEntity serverProp(){
        return ResponseEntity.ok(Collections.singletonList(serverProperties));
    }
}
