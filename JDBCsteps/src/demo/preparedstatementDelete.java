package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class preparedstatementDelete {

	public static void main(String[] args) {
		String query="delete from emp where name=?";
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo5", "root", "tiger");
			PreparedStatement ps=con.prepareStatement(query);
			System.out.println("enter the name: ");
			String name=sc.next();
			
			ps.setString(1, name);
			
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("deletion successfull");
				
			}
			else {
				System.out.println("error");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}