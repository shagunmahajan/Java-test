package com.java.classes;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.java.query.SearchData;

public class Student extends Person {
	
	int ROLLNUMBER;
	String MARKS;

	static HashMap<Integer, List<String>> studentData = new HashMap<Integer, List<String>>();
	static Scanner INPUTDATA = new Scanner(System.in);
		
	public Student(String firstName, String middleName, String lastName, 
			String contactNumber, String address, int rollNumber, String marks) {
		super(firstName,middleName,lastName,contactNumber, address);
		this.ROLLNUMBER = rollNumber;
		this.MARKS = marks;		
	}	
	
	public Student() {
		
	}
	public int getROLLNUMBER() {
		return ROLLNUMBER;
	}

	public void setROLLNUMBER(int rOLLNUMBER) {
		this.ROLLNUMBER = rOLLNUMBER;
	}

	public String getMARKS() {
		return MARKS;
	}

	public void setMARKS(String mARKS) {
		this.MARKS = mARKS;
	}
		
	public void studentAddDetails() throws IOException {
		
		System.out.println("Provide student details");
		System.out.println("Enter roll number");
		setROLLNUMBER(Integer.parseInt(INPUTDATA.nextLine()));
		if(studentData.containsKey(ROLLNUMBER)) {
				System.out.println("Rollnumber already exists");
				SearchData.showMenu();
		}
		else {
    		System.out.println("Enter first name");    			
    		setFIRSTNAME(INPUTDATA.nextLine());
    		System.out.println("Enter middle name");
    		setMIDDLENAME(INPUTDATA.nextLine());
    		System.out.println("Enter last name");
    		setLASTNAME(INPUTDATA.nextLine());
    		System.out.println("Enter contact number");
    		setCONTACTNUMBER(INPUTDATA.nextLine());
    		System.out.println("Enter Address");
    		setADDRESS(INPUTDATA.nextLine());
    		System.out.println("Enter marks");
    		setMARKS(INPUTDATA.nextLine());
    		studentData.put(ROLLNUMBER, Arrays.asList(FIRSTNAME,MIDDLENAME,LASTNAME,CONTACTNUMBER,ADDRESS,MARKS));
		}
	}
	
	public static void getStudentdata() throws IOException {
		System.out.println("Provide roll number for student:");
		int getStudentValue = Integer.parseInt(INPUTDATA.nextLine());
		if(!studentData.isEmpty()) {
			if(studentData.containsKey(getStudentValue)) {	
				System.out.println("Below are the Firstname, middle name, last name, contact number, address , marks for Rollnumber "+getStudentValue);
	    		System.out.println(studentData.get(getStudentValue).toString());
			}
			else {
				System.out.println("Rollnumber is not in the list");
				SearchData.showMenu();
			}
		}
		else {
			System.out.println("No data in student table");
			SearchData.showMenu();
		}

	}
	
	@Override
	public String toString() {
		return "Student [ROLLNUMBER=" + ROLLNUMBER + ", MARKS=" + MARKS + ", FIRSTNAME=" + FIRSTNAME + ", MIDDLENAME="
				+ MIDDLENAME + ", LASTNAME=" + LASTNAME + ", CONTACTNUMBER=" + CONTACTNUMBER + ", ADDRESS=" + ADDRESS
				+ "]";
	}

	public static void removeStudentData() throws IOException {
		System.out.println("Provide roll number to be removed");
		int removeStudentKey = Integer.parseInt(INPUTDATA.nextLine());
		if(!studentData.isEmpty()) {
			if(studentData.containsKey(removeStudentKey)) {
				studentData.remove(removeStudentKey);
	    		System.out.println("removed data for rollnumber "+removeStudentKey);
			}
			else {
				System.out.println("Rollnumber is not in the list");
				SearchData.showMenu();
			}
		}
		else {
			System.out.println("No data in student table");
			SearchData.showMenu();
		}
	}

}
