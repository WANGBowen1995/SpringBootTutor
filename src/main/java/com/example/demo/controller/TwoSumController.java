package com.example.demo.controller;

import com.example.demo.service.TwoSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class TwoSumController {
    @Autowired
    TwoSumService twoSumService;

    @GetMapping(path="/{target}", produces = "application/json")
    public HttpEntity getTwoSumDefault(@PathVariable("target") int target){
        int[] index = twoSumService.getMatchedIndexDefault(target);
        return new ResponseEntity<>(index, HttpStatus.OK);
    }

    @PostMapping(path="/input/{target}", produces = "application/json")
    public HttpEntity getTwoSum(@RequestBody List<Integer> nums, @PathVariable("target") int target) {
        int[] index = twoSumService.getMatchIndex(nums, target);
        return new ResponseEntity(index, HttpStatus.OK);
    }
}
