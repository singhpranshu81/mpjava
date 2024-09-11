package com.mpha.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbConnection {
	static Connection con;

	public static Connection getDbConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// forname is used to integrate one application to othr like driver is
														// a application

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mphdb", "root", "root@39");// url ,user,password
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

	public static void main(String[] args) {
		System.out.println(getDbConnection());
	}

}
