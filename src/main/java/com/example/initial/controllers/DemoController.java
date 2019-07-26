package com.example.initial.controllers;

import com.example.initial.request.RequestInput;
import com.example.initial.service.ExecuteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DemoController {

    @Autowired
    private ExecuteService executeService;

    @PostMapping("/executeOffers")
    public ResponseEntity executeOffers(@RequestBody RequestInput request) throws Exception {

        String genericResponse = executeService.executeOffers(request);
        return new ResponseEntity(genericResponse, null, HttpStatus.OK);
    }

    @GetMapping("migrateJson")
    public ResponseEntity getOffers() throws Exception {
        Map<String, String> genericResponse = executeService.migrateJson();
        return new ResponseEntity(genericResponse, null, HttpStatus.OK);
    }
}
