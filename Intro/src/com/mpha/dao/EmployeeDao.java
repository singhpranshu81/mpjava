package com.mpha.dao;

import com.mpha.model.Employee;

public interface EmployeeDao {
   public void createFTEEmployee(Employee employee);
   public void createPTEmployee(Employee employee);
   public void viewEmployee();
   public void callPro(Employee employee);
}
