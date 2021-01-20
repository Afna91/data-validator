package com.test.incoming;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.incoming.entity.IncomingData;
import com.test.incoming.entity.OutGoing;
import com.test.incoming.repository.IncomingRepository;
import com.test.incoming.repository.OutGoingRepository;
import com.test.incoming.util.StringOperations;

@SpringBootTest
class IncomingDataApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	IncomingRepository incomingRepo;

	@Autowired
	OutGoingRepository outGoingrepo;

	@Autowired
	StringOperations stringOperation;

	@Test
	public void incomingDataSaveTest() {

		IncomingData incomingData = new IncomingData();
		OutGoing outgoing = new OutGoing();
		incomingData.setId(704);
		incomingData.setFindDuplicates("ababcdeafe");
		incomingData.setValidateMeOnlyIActuallyShouldBeABoolean(true);
		incomingData.setWhiteSpacesGalore("ab cd b");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(91);
		incomingData.setNumbersMeetNumbers(numbers);

		IncomingData testedIncomingData = incomingRepo.save(incomingData);

		assertNotNull(testedIncomingData);

		outgoing.setId(incomingData.getId());
		Integer largestNumber = Collections.max(incomingData.getNumbersMeetNumbers());
		outgoing.setLargestNumber(largestNumber);

		String duplicate = stringOperation.findDuplicate(incomingData.getFindDuplicates());
		outgoing.setDuplicate(duplicate);
		String withOutWhiteSpace = stringOperation.removeWhiteSpace(incomingData.getWhiteSpacesGalore());
		outgoing.setStringWithoutWhiteSpace(withOutWhiteSpace);
		OutGoing testedOutGoing = outGoingrepo.save(outgoing);
		assertNotNull(testedOutGoing);
	}
	
	@Test
	public void outGoingGetTest() {
		outGoingrepo.findAll().forEach(c -> System.out.println(c.toString()));
	}

}
