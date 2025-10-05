package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insert {

	public static void main(String[] args) {
		String query="INSERT INTO EMP VALUES (?,?,sysdate())";
		Scanner sc =new Scanner(System.in);
		
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo5", "root", "tiger");
		PreparedStatement ps= con.prepareStatement(query);
		
		//collect the data from user
		
		System.out.println("Enter the id");
		int id=sc.nextInt();
		
		System.out.println("Enter the name");
		String name=sc.next();
				
				
				//set the value for placeholder
	
		ps.setInt(1,id);
		ps.setString(2,name);
		int i=ps.executeUpdate();
		
		if(i>0) {
			System.out.println("data added successfully!");
		}else {
			System.out.println("error");
		}
				
	
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
		

	}

}
