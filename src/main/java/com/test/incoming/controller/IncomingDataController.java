package com.test.incoming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.incoming.entity.IncomingData;
import com.test.incoming.service.IncomingDataService;

@RestController
public class IncomingDataController {

	@Autowired
	IncomingDataService service;

	@PostMapping("/incoming")
	public ResponseEntity<?> saveIncoming(@RequestBody IncomingData incomindData) {
		try {
			return service.saveIncomingData(incomindData);

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	@GetMapping("/outgoing")
	public ResponseEntity<?> getOutgoing() {
		try {
			return service.getOutgoing();

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
