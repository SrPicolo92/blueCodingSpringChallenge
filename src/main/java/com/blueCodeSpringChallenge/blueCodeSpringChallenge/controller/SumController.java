package com.blueCodeSpringChallenge.blueCodeSpringChallenge.controller;

import com.blueCodeSpringChallenge.blueCodeSpringChallenge.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SumController {
    @Autowired
    private SumService sumService;

    @GetMapping(path = "/sum")
    public Integer getSumFromArray(@RequestHeader String stringArray){
        return sumService.uniqueSum(stringArray);
    }
}
