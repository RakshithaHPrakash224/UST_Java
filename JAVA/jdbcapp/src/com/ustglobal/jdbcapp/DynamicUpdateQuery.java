package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			//load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step 1 get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//step 3 issue the SQL query
			String sql = "update employee_info set name =? , sal =? , gender =? where id =?";
			pstmt = conn.prepareStatement(sql);

			String empid = args[0];
			int id = Integer.parseInt(empid);
			
			String name = args[1];
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);

			String gender = args[3];
			
			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender);
			
			int count = pstmt.executeUpdate();

			//step 4 reaad the result
			System.out.println(count+ "Row(s) updated");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}//end of try-catch block
	}//end of main method
}//end of class