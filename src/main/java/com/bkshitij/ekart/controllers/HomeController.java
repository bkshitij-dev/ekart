package com.bkshitij.ekart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author Kshitij
 * @created 23-May-2024
 */
@RestController
@RequestMapping("/api/v1/home")
public class HomeController {

    @GetMapping
    String hello() {
        return "Hello from Home Controller";
    }
}
