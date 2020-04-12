package com.tstockroom.embrace.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping(value = "/ping")
public class HealthCheckController {

    @GetMapping
    public String ping() {
        return "Pinging.. " + LocalTime.now().toString();
    }
}
