package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExcuteInsertQuery {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		try {
			//Step 1 load the Driver

			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//Step 2 Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//Step 3 Issue SQL query
			String sql = "insert into employee_info values(6,'Amrita Raj',40000,'F')";
			stmt = conn.createStatement();
			int  count = stmt.executeUpdate(sql);

			//Step 4 Read the Result
			System.out.println(count + "Row(s) inserted");

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(conn!=null) {
					conn.close();
					
				}if (stmt!=null) {
					stmt.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}//end of main()
}// end of ExcuteInsertQuery

























