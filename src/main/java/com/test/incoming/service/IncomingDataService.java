package com.test.incoming.service;

import org.springframework.http.ResponseEntity;

import com.test.incoming.entity.IncomingData;

public interface IncomingDataService {

	public ResponseEntity<?> saveIncomingData(IncomingData incomingData);

	public ResponseEntity<?> getOutgoing();

}
