package com.mpha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mpha.model.Employee;
import com.mpha.util.MyDbConnection;
import com.mysql.cj.jdbc.CallableStatement;

public class EmployeeDaoImpl implements EmployeeDao {
      Connection con;
      PreparedStatement ps;
      Statement stmt;
      ResultSet rs;
	@Override
	public void createFTEEmployee(Employee emp) {
		// TODO Auto-generated method stub
		con =MyDbConnection.getDbConnection();
		try {
			ps=con.prepareStatement("insert into Employee(eno,ename,basic,hra,pf,net,gross) values(?,?,?,?,?,?,?)");
			ps.setInt(1,emp.getEmpno());
			ps.setString(2,emp.getEmpname());
			ps.setInt(3, emp.salary.getBasic());
			ps.setDouble(4, emp.salary.getHra());
			ps.setDouble(5, emp.salary.getPf());
			ps.setDouble(6, emp.salary.getNet());
			ps.setDouble(7, emp.salary.getGross());
			int rows=ps.executeUpdate();
			System.out.println("no.rows inserted "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void createPTEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void viewEmployee() {
		try {
		con=MyDbConnection.getDbConnection();
		stmt=con.createStatement();
		rs=stmt.executeQuery("select * from Employee");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void callPro(Employee employee) {
		con =MyDbConnection.getDbConnection();
		try {
		CallableStatement	cs=(CallableStatement) con.prepareCall("call PR(?,?,?,?,?,?,?)");
			cs.setInt(1,employee.getEmpno());
			cs.setString(2,employee.getEmpname());
			cs.setInt(3, employee.salary.getBasic());
		cs.setDouble(4, employee.salary.getHra());
		cs.setDouble(5, employee.salary.getPf());
			cs.setDouble(6, employee.salary.getNet());
			cs.setDouble(7, employee.salary.getGross());
			cs.execute();
			System.out.println("Procedure successfulyy executed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
