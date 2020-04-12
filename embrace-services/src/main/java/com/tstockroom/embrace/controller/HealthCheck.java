package com.tstockroom.embrace.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping(value = "/ping")
public class HealthCheck {

    @GetMapping
    public String ping(){
        return "Service is up with current time: " + LocalTime.now().toString();
    }
}
