package com.ebook.dao;

import java.sql.*;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/ebook","root","samota3666");
		
	}catch(Exception e){System.out.println(e);}
	return con;
}
}
