package com.revature.hydraaggregatorservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AddressServiceController {

    @PostMapping("/location")
    public ResponseEntity createBatch(@RequestBody Map<String, Object> request) {
        request.forEach((k, v) -> {
            System.out.println("Key: " + k + " Value: " + v);
        });
        return new ResponseEntity<>(request, HttpStatus.OK);
    }

}
