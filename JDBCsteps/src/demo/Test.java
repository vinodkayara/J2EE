package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		String query="INSERT INTO EMP VALUES(1,'VINOD',SYSDATE())";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  //1
			System.out.println("Driver Loaded");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo5", "root", "tiger"); //2
			System.out.println("Connection established");
			
			Statement st=con.createStatement();
			System.out.println("Platform created");
			
			int i=st.executeUpdate(query);
			System.out.println("No of rows inserted:"+i);
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
