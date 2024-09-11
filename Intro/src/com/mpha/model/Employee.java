package com.mpha.model;

import java.io.Serializable;
import java.util.Comparator;

public class Employee implements Serializable,Comparable<Employee>{  // has a relationship  --> Employee has a name ,id,salary
 private int empno;
 private String empname; // string is predefined datatype
  //private Salary salary;  // user defined reference datatype
  private Parttime sl;
  public FullTime salary;
public int getEmpno() {
	return empno;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public Parttime getSl() {
	return sl;
}
public void setSl(Parttime sl) {
	this.sl = sl;
}
public FullTime getSalary() {
	return salary;
}
public void setSalary(FullTime salary) {
	this.salary = salary;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
@Override
public String toString() {
	return "Employee [empno=" + empno + ", empname=" + empname + ", sl=" + sl + ", salary=" + salary + "]";
}
@Override
public int compareTo(Employee e) {
	// TODO Auto-generated method stub
	return this.getEmpno()-e.getEmpno();
}
public static Comparator<Employee> mycom= new Comparator<Employee>() {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getEmpname().compareTo(e2.getEmpname());
	}
	
};
}
// ensure to use tostring() in all the model classes