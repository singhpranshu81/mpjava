package com.mpha.exceptions;

public class EmployeeNotFoundException extends Exception {

	public EmployeeNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public EmployeeNotFoundException(String message) {
		super(message);
		System.out.println(message);
		
	}



	@Override
	public String toString() {
		return "EmployeeNotFoundException []";
	}


	

	
}
//public EmployeeNotFoundException() {
//	super();
//	// TODO Auto-generated constructor stub
//}
//
//
//
//public EmployeeNotFoundException(String message) {
//	super(message);
//	System.out.println(message);
//	// TODO Auto-generated constructor stub
//}
//
//
//
//@Override
//public String toString() {
//	return "EmployeeNotFoundException []";
//}
