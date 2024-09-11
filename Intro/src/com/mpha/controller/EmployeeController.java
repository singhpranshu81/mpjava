package com.mpha.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.mpha.dao.EmployeeDao;
import com.mpha.dao.EmployeeDaoImpl;
import com.mpha.model.Employee;
import com.mpha.model.FullTime;
import com.mpha.model.Parttime;
import com.mpha.model.Salary;



public class EmployeeController implements Employeeintrface{
	 Employee emp;
	// Salary sal= new Salary();
	 FullTime sal=new FullTime();
	 Parttime pr=new Parttime();
	 Scanner sc = new Scanner(System.in);
	 List<Employee> emplist = new ArrayList<>();
	 EmployeeDao dao=new EmployeeDaoImpl();
       public void addEmp() {
    	   emp=new Employee();
    	   int p=0;
    	   String s=null;
    	   String type=null;
    	  // push all the values to the model
    	   System.out.println("Enter Emp name: ");
    	   s=sc.next();
    	   System.out.println("Enter Emp ID: ");
    	   p=sc.nextInt();
    	   System.out.println("Enter Emp Type:F or P  ");
    	   type=sc.next();
    		emp.setEmpno(p);
    		emp.setEmpname(s);
    		if(type.equals("F")) {
    		System.out.println("Enter salary: ");
    		int basic = sc.nextInt();
    		sal.setBasic(basic);
    		sal.setHra();
    		sal.setPf();
    		sal.setGross();
    		sal.setNet();
    		System.out.println("salary: ");
    		sal.totsalary();
             emp.setSalary(sal);
             emplist.add(emp);
             dao.createFTEEmployee(emp);
    		System.out.println("Employee added");
    		}
    		else if (type.equals("P"))
    		{
    			System.out.println("Enter hours worked : ");
         		int basic = sc.nextInt();
         		pr.setHours(basic);
         		System.out.println("Enter wage/hr worked : ");
         		int d = sc.nextInt();
         		pr.setTsal(d);
         		System.out.println("salary: ");
         		pr.totsalary();
         		emp.setSl(pr);
         		 emplist.add(emp);
         		   dao.createPTEmployee(emp);
         		System.out.println("Employee added");
    		}
    		
          }
    
       public void viewemp()
          {
    	  // System.out.println(emp.getempno() + " "+ emp.getname());
//    	   Iterator i = emplist.iterator();
//    	   while(i.hasNext()) {
//   			System.out.println(i.next());
//   		}
    	   emplist.forEach((li)->System.out.println(li));
    	//  System.out.println(emp);
    	   }
       public void serialize() throws IOException {
   		try {
   			FileOutputStream fos = new FileOutputStream("myempfile.txt");
   			ObjectOutputStream oos = new ObjectOutputStream(fos);
   			oos.writeObject(emplist);
   			System.out.println("Serialized successfully");
   		} catch (FileNotFoundException e) {

   			e.printStackTrace();
   		}
   	}
       public void deserialize() {

   		try (FileInputStream fis = new FileInputStream("myempfile.txt");
   				ObjectInputStream ois = new ObjectInputStream(fis)) {
   			List<Employee> empl = (List<Employee>) ois.readObject();

   			Iterator<Employee> i =  empl.iterator();
   			while(i.hasNext()) {
   				System.out.println(i.next());
   			}

   		} catch (IOException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		} catch (ClassNotFoundException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}

   	}

	@Override
	public void sortbyempno() {
		Collections.sort(emplist);
	}

	@Override
	public void sortbyEmpname() {
         Collections.sort(emplist, emp.mycom);
	}

	@Override
	public void callpro() {
          Employee empl=new Employee();
          Salary sa = new Salary();
          
          System.out.println("Enter empno: ");
          int eno=sc.nextInt();
          empl.setEmpno(eno);
          System.out.println("Enter empname: ");
          String s=sc.next();
          empl.setEmpname(s);
          System.out.println("Enter basic: ");
          int basic=sc.nextInt();
         empl.salary.setBasic(basic);
         
         empl.salary.setHra();
      
         empl.salary.setPf();
         
         empl.salary.setGross();
         
         empl.salary.setNet();
         
         
	}

     
}
