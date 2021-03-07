package com.luizcdev.ilockermiddleware.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LockerAccessController {
	
	@PostMapping("/unlock/{uuid}")
    public ResponseEntity<String> postUnlock(@PathVariable(name = "uuid") final String uuid) {
		
		System.out.println(uuid);
        return new ResponseEntity<>("Sucesso", HttpStatus.OK);
                
    }	

}
