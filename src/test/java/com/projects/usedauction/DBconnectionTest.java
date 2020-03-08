package com.projects.usedauction;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

//-- DB Connection TEST
public class DBconnectionTest {

	@Test
	public void testDataSource() throws ClassNotFoundException{
	Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/platform?useSSL=false&serverTimezone=Asia/Seoul", "root", "TIGER");
			System.out.println(" DB Connection TEST : "+con);
		} catch (Exception e) { e.printStackTrace(); }
	}
}
