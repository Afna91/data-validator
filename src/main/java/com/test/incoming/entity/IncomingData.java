package com.test.incoming.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "incomings")
public class IncomingData {

	private Integer id;
	private String findDuplicates;
	private String whiteSpacesGalore;
	private Boolean validateMeOnlyIActuallyShouldBeABoolean;
	private List<Integer> numbersMeetNumbers;

	public IncomingData() {
		super();
	}

	public IncomingData(Integer id, String findDuplicates, String whiteSpacesGalore,
			Boolean validateMeOnlyIActuallyShouldBeABoolean, List<Integer> numbersMeetNumbers) {
		super();
		this.id = id;
		this.findDuplicates = findDuplicates;
		this.whiteSpacesGalore = whiteSpacesGalore;
		this.validateMeOnlyIActuallyShouldBeABoolean = validateMeOnlyIActuallyShouldBeABoolean;
		this.numbersMeetNumbers = numbersMeetNumbers;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFindDuplicates() {
		return findDuplicates;
	}

	public void setFindDuplicates(String findDuplicates) {
		this.findDuplicates = findDuplicates;
	}

	public String getWhiteSpacesGalore() {
		return whiteSpacesGalore;
	}

	public void setWhiteSpacesGalore(String whiteSpacesGalore) {
		this.whiteSpacesGalore = whiteSpacesGalore;
	}

	public Boolean getValidateMeOnlyIActuallyShouldBeABoolean() {
		return validateMeOnlyIActuallyShouldBeABoolean;
	}

	public void setValidateMeOnlyIActuallyShouldBeABoolean(Boolean validateMeOnlyIActuallyShouldBeABoolean) {
		this.validateMeOnlyIActuallyShouldBeABoolean = validateMeOnlyIActuallyShouldBeABoolean;
	}

	public List<Integer> getNumbersMeetNumbers() {
		return numbersMeetNumbers;
	}

	public void setNumbersMeetNumbers(List<Integer> numbersMeetNumbers) {
		this.numbersMeetNumbers = numbersMeetNumbers;
	}

	@Override
	public String toString() {
		return "IncomingData [id=" + id + ", findDuplicates=" + findDuplicates + ", whiteSpacesGalore="
				+ whiteSpacesGalore + ", validateMeOnlyIActuallyShouldBeABoolean="
				+ validateMeOnlyIActuallyShouldBeABoolean + ", numbersMeetNumbers=" + numbersMeetNumbers + "]";
	}

}
