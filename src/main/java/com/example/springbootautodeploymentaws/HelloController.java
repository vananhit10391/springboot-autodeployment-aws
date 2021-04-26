package com.example.springbootautodeploymentaws;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/")
    public ResponseEntity<?> home() {
        return ResponseEntity.ok("Hello spring boot auto deploy to AWS...");
    }
}
