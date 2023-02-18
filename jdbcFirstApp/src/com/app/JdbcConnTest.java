package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcConnTest {
	
	
	public static void main(String[] args) throws Exception {
		
		//1-jdbc properties -oracle db db connection
		
		//String driverclass="oracle.jdbc.driver.OracleDriver";
		//String url ="jdbc:oracle:thin:@localhost:1521:xe";
		//String username="system";
		//String password ="manager";
		String driverclass="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/sakila";
		String username="root";
		String password ="root";
		String query="insert into student values(2,'Sunil',7.5)";
		String updatesql="update student set sname='ansh' where id=2";
		
		//2.jdbc code
		Class.forName(driverclass);
		
		Connection conn=DriverManager.getConnection(url, username, password);
		System.out.println("++++++++++++"+conn);
		
		//create statment
		       Statement st=conn.createStatement();
		       
		       //Execute statement
		     //  st.execute(query);
		       //get result
		    int count =st.executeUpdate(updatesql);
		    //print result
		    System.out.println("data inserted into table successfylly"+count);
		    //close connection
		    conn.close();
	}

}
