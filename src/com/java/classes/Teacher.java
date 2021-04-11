package com.java.classes;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.java.query.SearchData;

public class Teacher extends Person {
	int EMPLOYEEID;
	String SALARY;
	String BONUS;
	static Scanner INPUTDATA = new Scanner(System.in);
	static HashMap<Integer, List<String>> teacherData = new HashMap<Integer, List<String>>();
		
	public Teacher(String firstName, String middleName, String lastName, String contactNumber, String address, 
			int EmployeeId, String Salary, String Bonus) {
		super(firstName, middleName, lastName, contactNumber, address);
		this.EMPLOYEEID = EmployeeId;
		this.SALARY = Salary;
		this.BONUS = Bonus;
	}
	
	public Teacher() {
		
	}

	public int getEMPLOYEEID() {
		return EMPLOYEEID;
	}

	public void setEMPLOYEEID(int eMPLOYEEID) {
		EMPLOYEEID = eMPLOYEEID;
	}

	public String getSALARY() {
		return SALARY;
	}

	public void setSALARY(String sALARY) {
		SALARY = sALARY;
	}

	public String getBONUS() {
		return BONUS;
	}

	public void setBONUS(String bONUS) {
		BONUS = bONUS;
	}

	
	public void teacherAddDetails() throws IOException {
		
		System.out.println("Provide teacher details");
		
		System.out.println("Enter employee id");
		setEMPLOYEEID(Integer.parseInt(INPUTDATA.nextLine()));
		if(teacherData.containsKey(EMPLOYEEID)) {
			System.out.println("employee id already exists");
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
			
			System.out.println("Enter salary");
			setSALARY(INPUTDATA.nextLine());
			System.out.println("Enter bonus");
			setBONUS(INPUTDATA.nextLine());
			teacherData.put(EMPLOYEEID, Arrays.asList(FIRSTNAME,MIDDLENAME,LASTNAME,CONTACTNUMBER,ADDRESS,SALARY,BONUS));
		}
		 
	}
	
	public static void getTeacherdata() throws IOException {
		System.out.println("Provide Employee id for teacher:");
		int getTeacherValue = Integer.parseInt(INPUTDATA.nextLine());
		if(!teacherData.isEmpty()) {
			if(teacherData.containsKey(getTeacherValue)) {
				System.out.println("Below are the Firstname, middle name, last name, contact number, address , salary, bonus for Employee id "+getTeacherValue);
				System.out.println(teacherData.get(getTeacherValue).toString());
			}
			else {
				System.out.println("Employee ID is not in the list");
				SearchData.showMenu();
			}
		}
		else {
			System.out.println("No data in teacher table");
			SearchData.showMenu();
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Teacher [EMPLOYEEID=" + EMPLOYEEID + ", SALARY=" + SALARY + ", BONUS=" + BONUS + ", FIRSTNAME="
				+ FIRSTNAME + ", MIDDLENAME=" + MIDDLENAME + ", LASTNAME=" + LASTNAME + ", CONTACTNUMBER="
				+ CONTACTNUMBER + ", ADDRESS=" + ADDRESS + "]";
	}

	public static void removeTeacherData() throws IOException {
		System.out.println("Provide Employee id to be removed");
		int removeTeacherKey = Integer.parseInt(INPUTDATA.nextLine());
		if(!teacherData.isEmpty()) {
			if(teacherData.containsKey(removeTeacherKey)) {
				teacherData.remove(removeTeacherKey);
	    		System.out.println("removed data for Employee ID "+removeTeacherKey);
			}
			else {
				System.out.println("Employee ID is not in the list");
				SearchData.showMenu();
			}
		}
		else {
			System.out.println("No data in teacher table");
			SearchData.showMenu();
		}
	}
}
