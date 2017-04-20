package com.example.employee.details;

import java.util.Scanner;

public class Employee_Details {

	String EmployeeName;
	String EmployeeAdress;
	String EmployeePhone;
	int Age ;

public void Accept()
{

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the name:");
	EmployeeName= sc.next();

	System.out.println("Enter the Adress:");
	EmployeeAdress= sc.next();

	System.out.println("Enter the Phone:");
	EmployeePhone= sc.next();

	System.out.println("Enter the Age:");
	Age= sc.nextInt();
	
	sc.close();									
}


public void Display()
{
	System.out.println(" name:" + EmployeeName);
	System.out.println(" Adress:" + EmployeeAdress);
	System.out.println(" Phone:" + EmployeePhone);
	System.out.println(" Age:" + Age);	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_Details details = new Employee_Details();

		details.Accept();
		details.Display ();
		
	}

}
