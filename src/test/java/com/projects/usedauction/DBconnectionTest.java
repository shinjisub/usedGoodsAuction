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
			Connection con = DriverManager.getConnection("jdbc:mysql://ec2-13-209-96-85.ap-northeast-2.compute.amazonaws.com:3306/usedAuction?useSSL=false&serverTimezone=Asia/Seoul", "root", "Tlswltjq001!");
			System.out.println(" DB Connection TEST : "+con);
		} catch (Exception e) { e.printStackTrace(); }
	}
}
