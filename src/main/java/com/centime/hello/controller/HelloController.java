package com.centime.hello.controller;

import com.centime.hello.util.LogMethodParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    @LogMethodParam
    public ResponseEntity<String> health() {
        return ResponseEntity.of(Optional.of("Hello"));
    }
}
