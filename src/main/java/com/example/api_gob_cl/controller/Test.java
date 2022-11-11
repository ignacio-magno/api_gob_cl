package com.example.api_gob_cl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.api_gob_cl.repository.TestRepository;

import java.util.List;

@RestController
public class Test {
    private final TestRepository repository;

    Test(TestRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/test")
    List<com.example.api_gob_cl.models.Test> all() {
        return repository.findAll();
    }

    @PostMapping("/test")
    com.example.api_gob_cl.models.Test newTest(@RequestBody com.example.api_gob_cl.models.Test newTest) {
        return repository.save(newTest);
    }
}
