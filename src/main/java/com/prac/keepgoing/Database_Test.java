package com.prac.keepgoing;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class Database_Test {
	@Test
	public void test() throws Exception{
		Class.forName("org.mariadb.jdbc.Driver");	//마리아 DB
		Connection con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/estdb", "root", "1234");
		System.out.println(con);
	}
}
