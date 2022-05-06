package com.intermediate.superkeyword;
import java.util.Scanner;

class parentClass{
	int RegisterNo;
	String Name;
	Scanner s=new Scanner(System.in);
	parentClass()
	{
		RegisterNo=666;
		Name="Vinothkumar Selvaarasan";
	}
	parentClass(int RegisterNo,String Name)
	{
		this.RegisterNo=RegisterNo;
		this.Name=Name;
	}
	void getParentData()
	{
		System.out.println("Enter the Register Number ");
		RegisterNo=s.nextInt();
		System.out.println("Enter the Name ");
		Name=s.next();
	}
	void printData()
	{
		System.out.println("Register No "+RegisterNo);
		System.out.println("Name is "+Name);
	}
}

public class Registeration extends parentClass {
	
	String City;
	long mobileNo;
	Registeration()
	{
		super();
		//Its used to call parent Class Constructor.It should be the First 
		//Statement in any block.bcoz its constructor.
		City="Chennai";
		mobileNo=934488356;
		
		
	}
	Registeration(int r,String n,String City,long mobileNo)
	{
		super(r,n);//Its used to call parent Class Constructor with arguments
		this.City=City;
		this.mobileNo=mobileNo;
	}
	void getChildClassData()
	{
		
		super.getParentData();//Its used to call parent class method
		System.out.println("Enter the City Name ");
		City=s.next();
		System.out.println("Enter the Mobile no");
		mobileNo=s.nextLong();
		
	}
	void printDataChild()
	{
		super.printData();//Its used to call parent class method
		System.out.println("City "+City);
		System.out.println("Mobile No "+mobileNo);
	}

	public static void main(String[] args) {
		Registeration r=new Registeration();
		r.printDataChild();
		Registeration r1=new Registeration(667,"Ashokkumar Selvaarasan","Chennai",98837386);
		r1.printDataChild();
		Registeration r2=new Registeration();
		r2.getChildClassData();
		r2.printDataChild();
	}

}

