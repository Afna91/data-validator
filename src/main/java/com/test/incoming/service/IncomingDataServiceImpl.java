package com.test.incoming.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.test.incoming.entity.IncomingData;
import com.test.incoming.entity.OutGoing;
import com.test.incoming.repository.IncomingRepository;
import com.test.incoming.repository.OutGoingRepository;
import com.test.incoming.util.StringOperations;

@Service
public class IncomingDataServiceImpl implements IncomingDataService {

	@Autowired
	IncomingRepository repository;

	@Autowired
	OutGoingRepository outGoingRepo;

	@Override
	public ResponseEntity<?> saveIncomingData(IncomingData incomingData) {

		IncomingData incomingDataSaved = repository.save(incomingData);
		OutGoing outgoing = new OutGoing();
		outgoing.setId(incomingData.getId());
		Integer largestNumber = Collections.max(incomingData.getNumbersMeetNumbers());
		outgoing.setLargestNumber(largestNumber);

		String duplicate = StringOperations.findDuplicate(incomingData.getFindDuplicates());
		outgoing.setDuplicate(duplicate);
		String withOutWhiteSpace = StringOperations.removeWhiteSpace(incomingData.getWhiteSpacesGalore());
		outgoing.setStringWithoutWhiteSpace(withOutWhiteSpace);
		outGoingRepo.save(outgoing);

		return new ResponseEntity<>("Saved incoming "+incomingDataSaved, HttpStatus.CREATED);

	}

	@Override
	public ResponseEntity<?> getOutgoing() {
		List<OutGoing> outGoing = outGoingRepo.findAll();
		return new ResponseEntity<>("All Saved Outgoings : "+outGoing, HttpStatus.OK);
	}

}
