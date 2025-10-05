package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class retrive2 {

	public static void main(String[] args) {
		String query="SELECT * FROM EMP WHERE NAME=?";
		Scanner sc= new Scanner(System.in);
		          try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo5", "root", "tiger");
					PreparedStatement ps=con.prepareStatement(query);
					System.out.println("Enter the name :");
					String name=sc.next();
					
					ps.setString(1, name);
					ResultSet rs =ps.executeQuery();
					while(rs.next()) {
						String empname=rs.getString("name");
						System.out.println("name is "+  name);
					}
					
					
						

					
				  } catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				  }

	}

}
