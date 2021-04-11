package com.java.query;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.java.classes.*;

public class SearchData {

	static Scanner INPUTDATA = new Scanner(System.in);
	private static Student studentTable = new Student();
	private static Teacher teacherTable = new Teacher();
    
    
    public void readPassword() throws IOException {
    	
    	FileReader passwordfile = new FileReader(("PasswordFile.txt"));
    	int readCharacter;
    	StringBuilder readPassword = new StringBuilder();
    	while((readCharacter=passwordfile.read())!=-1) {
    		readPassword.append((char)readCharacter); 
    	}		
    	passwordfile.close();
    	System.out.println("Password shouldn't contain spaces");
    		
    	int COUNT = 4;
    	while(COUNT!=0) {
    		System.out.println("Please enter valid password: ");
    		String INPUTPASSWORD = INPUTDATA.nextLine();
    		if (INPUTPASSWORD.equals(readPassword.toString())) {
    			System.out.println("Password Accepted");
    			showMenu();				
    			System.exit(0);
    		}			
    		else {
    			COUNT--;
    			System.out.println("Entered password is incorrect, "+COUNT+" attempts left");
    		}
    	}	
    	if(COUNT==0)
    		System.out.println("No more attempts left");
    	
    	System.exit(0);
    }

//    	1. Add Student Details - Add the details of a new student
//    	2. Remove Student Details - Remove a student from records
//    	3. Add Teacher Details - Add the details of a new teacher
//    	4. Remove Teacher Details- Remove a teacher from records
//    	5. Query Data- Ask user to enter a query and show the results
//    	6. Exit
    	public static void showMenu() throws IOException{
    		
    		int INPUTOPTION; 
    		do {

    			System.out.println("Please enter your choice:\n 1 to Add Student Details\n 2 to Remove Student details\n "
    					+ "3 to Add Teacher details\n 4 to Remove Teacher Details\n "
    					+ "5 to Query data\n 6 to Exit");
    				
    			INPUTOPTION = Integer.parseInt(INPUTDATA.nextLine());
    			
    			switch (INPUTOPTION) {
    				case 1:
    					System.out.println("You have selected 1, Enter required details");
    					studentTable.studentAddDetails();
    					break;
    				
    				case 2:
                        studentTable.removeStudentData();
    					break;
    				
    				case 3:
    					teacherTable.teacherAddDetails();
    					break;
    				
    				case 4:
    					teacherTable.removeTeacherData();
    					break;
    				
    				case 5:
                        studentTable.getStudentdata();
                        teacherTable.getTeacherdata();
    					break;
    				
    				case 6:
    					System.out.println("System exited");
    					System.exit(0);
    					break;
    				
    				default:
    					System.out.println("Enter a valid input");
    					
    				}
    		}while(INPUTOPTION != 6);
    		
    	}    	
}
