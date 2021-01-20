package com.test.incoming.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "outgoing")
public class OutGoing {
	private Integer id;
	private Integer largestNumber;
	private String duplicate;
	private String stringWithoutWhiteSpace;

	public OutGoing() {
		super();
	}

	public OutGoing(Integer id, Integer largestNumber, String duplicate, String stringWithoutWhiteSpace) {
		super();
		this.id = id;
		this.largestNumber = largestNumber;
		this.duplicate = duplicate;
		this.stringWithoutWhiteSpace = stringWithoutWhiteSpace;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLargestNumber() {
		return largestNumber;
	}

	public void setLargestNumber(Integer largestNumber) {
		this.largestNumber = largestNumber;
	}

	public String getDuplicate() {
		return duplicate;
	}

	public void setDuplicate(String duplicate) {
		this.duplicate = duplicate;
	}

	public String getStringWithoutWhiteSpace() {
		return stringWithoutWhiteSpace;
	}

	public void setStringWithoutWhiteSpace(String stringWithoutWhiteSpace) {
		this.stringWithoutWhiteSpace = stringWithoutWhiteSpace;
	}

	@Override
	public String toString() {
		return "OutGoing [id=" + id + ", largestNumber=" + largestNumber + ", duplicate=" + duplicate
				+ ", stringWithoutWhiteSpace=" + stringWithoutWhiteSpace + "]";
	}

}
