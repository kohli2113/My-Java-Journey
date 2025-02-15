package PrimeNumberGame.src.Feb07;

import java.sql.*;
import java.util.Scanner;

public class JDBC_InClass {
    public static void main(String args[]) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //register the driver

            String url="jdbc:mysql://localhost:3306/cg_student"; //we need the database name after the port
            String username="root";
            String password="Vaibhav1";

            Connection con=DriverManager.getConnection(url,username,password); //connecting to the sql

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter id: ");
            int id=sc.nextInt();
            System.out.println("Enter name: ");
            String name=sc.next();
            System.out.println("Enter age: ");
            int age=sc.nextInt();

            //now we are creating the query we want to execute
            PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)"); //we put ? bcoz we don't know the datatype
            ps.setInt(1,id);
            ps.setString(2, name);
            ps.setInt(3, age);
            int result=ps.executeUpdate();  //1 or 0
            if(result==1)
            {
                System.out.println("added successfully");
            }
            else
            {
                System.out.println("Failed");
            }
        }
        catch(SQLException e)
        {
        }
    }
}