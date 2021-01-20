package com.test.incoming.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.test.incoming.entity.IncomingData;
import com.test.incoming.entity.OutGoing;

public interface IncomingDataService {

	public ResponseEntity<IncomingData> saveIncomingData(IncomingData incomingData);

	public ResponseEntity<List<OutGoing>> getOutgoing();

}
