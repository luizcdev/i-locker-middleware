package com.luizcdev.ilockermiddleware.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/id")
public class LockerIDController {
	
	@GetMapping("/random")
    public ResponseEntity<String> getRandomId() {
		
		UUID uuid = UUID.randomUUID();
        return new ResponseEntity<>(uuid.toString(), HttpStatus.OK);
                
    }	
	
}
