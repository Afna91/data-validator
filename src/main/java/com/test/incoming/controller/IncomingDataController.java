package com.test.incoming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.incoming.entity.IncomingData;
import com.test.incoming.entity.OutGoing;
import com.test.incoming.service.IncomingDataService;

@RestController
public class IncomingDataController {

	private final IncomingDataService service;

	@Autowired
	public IncomingDataController(IncomingDataService service) {
		this.service = service;
	}

	@PostMapping("/incoming")
	public ResponseEntity<IncomingData> saveIncoming(@RequestBody IncomingData incomindData) {

		return service.saveIncomingData(incomindData);

	}

	@GetMapping("/outgoing")
	public ResponseEntity<List<OutGoing>> getOutgoing() {

		return service.getOutgoing();

	}

}
