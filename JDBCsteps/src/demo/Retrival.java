package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Retrival {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");    //load and register the driver class
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo5", "root", "tiger");  
            Statement st = con.createStatement();                   

            System.out.println("Enter the Name:");
            String name = sc.nextLine();

            // ✅ Add single quotes around the name
            String query = "SELECT * FROM EMP WHERE NAME = '" + name + "'";

            ResultSet rs = st.executeQuery(query);
//            boolean found = false;

            while (rs.next()) {
//                found = true;
                int id = rs.getInt("id");
                String names = rs.getString("name");

                System.out.println("ID: " + id);
                System.out.println("Name: " + names);
                System.out.println("-----------------");
            }

            
          
       
            

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
