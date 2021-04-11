package com.java.classes;

public class Person {

	String FIRSTNAME;
	String MIDDLENAME;
	String LASTNAME;
	String CONTACTNUMBER;
	String ADDRESS;
		
	public Person(String firstName, String middleName, String lastName, String contactNumber, String address) {
		this.FIRSTNAME = firstName;
		this.MIDDLENAME = middleName;
		this.LASTNAME = lastName;
		this.CONTACTNUMBER = contactNumber;
		this.ADDRESS = address;
	}	
	
	public Person() {
		
	}
	
	public String getFIRSTNAME() {
		return FIRSTNAME;
	}

	public void setFIRSTNAME(String fIRSTNAME) {
		this.FIRSTNAME = fIRSTNAME;
	}

	public String getMIDDLENAME() {
		return MIDDLENAME;
	}

	public void setMIDDLENAME(String mIDDLENAME) {
		this.MIDDLENAME = mIDDLENAME;
	}

	public String getLASTNAME() {
		return LASTNAME;
	}

	public void setLASTNAME(String lASTNAME) {
		this.LASTNAME = lASTNAME;
	}

	public String getCONTACTNUMBER() {
		return CONTACTNUMBER;
	}

	public void setCONTACTNUMBER(String cONTACTNUMBER) {
		this.CONTACTNUMBER = cONTACTNUMBER;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		this.ADDRESS = aDDRESS;
	}
}
