package com.jdbcPgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCImplementation {
	Scanner s=new Scanner(System.in);
	
	RegisterStudentInfo rsi=new RegisterStudentInfo();
	
	void addStudentDetails()
	{
		System.out.println("Enter the Register Number ");
		rsi.setRegisteration(s.nextInt());
		System.out.println("Enter the Name ");
		rsi.setName(s.next());
		System.out.println("Enter the Father Name ");
		rsi.setFatherName(s.next());
		System.out.println("Enter the Mother Name ");
		rsi.setMotherName(s.next());
	}
	void insertDataIntoDB()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cobj=DriverManager.getConnection("jdbc:mysql://localhost:3306/iisn_newgensoftware", "root", "12345678");
			PreparedStatement ps=cobj.prepareStatement("insert into registeration(registerationNo,name,fathername,mothername)values(?,?,?,?)");
			ps.setInt(1, rsi.getRegisteration());
			ps.setString(2, rsi.getName());
			ps.setString(3, rsi.getFatherName());
			ps.setString(4, rsi.getMotherName());
			int i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Insertion Done Successfully");
			}
			else {
				System.out.println("Error in Insertion");
			}
			
		
		}
		catch(ClassNotFoundException ce)
		{
			System.out.println("Class Not Found Exception ");
		}
		catch(SQLException sqle)
		{
			System.out.println("SQL Exception "+sqle);
		}
		
	}
	void reterival()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cobj=DriverManager.getConnection("jdbc:mysql://localhost:3306/iisn_newgensoftware","root","12345678");
			PreparedStatement ps=cobj.prepareStatement("select * from registeration ");
			ResultSet resultSet=ps.executeQuery();
			while(resultSet.next())
			{
				System.out.println("Serial No is "+resultSet.getInt(1));
				System.out.println("Register No is "+resultSet.getInt(2));
				System.out.println("Name is "+resultSet.getString(3));
				System.out.println("Father Name is "+resultSet.getString(5));
				System.out.println("Mother Name  is "+resultSet.getString(6));
			}
		}
		catch(ClassNotFoundException cec)
		{
			System.out.println(cec);
		}
		catch(SQLException sqle)
		{
			System.out.println("SQL Exception "+sqle);
		}
		
	}
	
	void UpdateDataIntoDB()
	{
		System.out.println("Enter the Serial Number u want to Update ");
		int r=s.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cobj=DriverManager.getConnection("jdbc:mysql://localhost:3306/iisn_newgensoftware", "root", "12345678");
			PreparedStatement ps=cobj.prepareStatement("update registeration set registerationNo=?,name=?,fathername=?,mothername=? where sno=?");
			ps.setInt(1, rsi.getRegisteration());
			ps.setString(2, rsi.getName());
			ps.setString(3, rsi.getFatherName());
			ps.setString(4, rsi.getMotherName());
			ps.setInt(5, r);
			int i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Update Done Successfully");
			}
			else {
				System.out.println("Error in Updation");
			}
			
		
		}
		catch(ClassNotFoundException ce)
		{
			System.out.println("Class Not Found Exception ");
		}
		catch(SQLException sqle)
		{
			System.out.println("SQL Exception "+sqle);
		}
		
	}
	
	void deleteData()
	{
		System.out.println("Enter the Register Number u want to Delete ");
		int r=s.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cobj=DriverManager.getConnection("jdbc:mysql://localhost:3306/iisn_newgensoftware", "root", "12345678");
			PreparedStatement ps=cobj.prepareStatement("delete from registeration where registerationNo=?");
			ps.setInt(1, r);
		
			int i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Deletion Done Successfully");
			}
			else {
				System.out.println("Error in Deletion");
			}
			
		
		}
		catch(ClassNotFoundException ce)
		{
			System.out.println("Class Not Found Exception ");
		}
		catch(SQLException sqle)
		{
			System.out.println("SQL Exception "+sqle);
		}
	}
	void options()
	{
		System.out.println("Enter your Choice\n1.Insert\n2.Delete\n3.Update\n4.Select ");
		int choice=s.nextInt();
		switch(choice) {
		case 1:
			this.addStudentDetails();
			this.insertDataIntoDB();
			this.reterival();
			break;
		case 2:
			this.deleteData();
			break;
		case 3:
			this.reterival();
			this.addStudentDetails();
			this.UpdateDataIntoDB();
			break;
		case 4:
			this.reterival();
			break;
		}
	}
	public static void main(String[] args) {
		JDBCImplementation jijdbci=new JDBCImplementation();
		jijdbci.options();
	}
	

}
