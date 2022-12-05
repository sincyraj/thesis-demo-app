package com.vub.thesis.demo.controller;

import com.vub.thesis.demo.resource.DemoResource;
import com.vub.thesis.demo.service.DemoService;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Log
public class DemoController {
    private final DemoService service;

    public DemoController(DemoService service) {
        this.service = service;
    }

    @PostMapping(value = "/add-data", consumes = "application/json")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void saveRequest(@RequestBody @Valid DemoResource demoResource) {
        service.save(demoResource);
    }
}
