package com.intermediate.polymorphismPgm;

public class FunctionOverloadingPgm {
	//Method name is same but no of arguments and type of arguments is difference
	//in the same classes.
	
	void getData()
	{
		System.out.println("Hai How are you");
	}
	void getData(String name)
	{
		System.out.println("Hai "+name);
	}
	void getData(String name,String dept)
	{
		System.out.println("Hai "+name +" Welcome to dept");
	}
	public static void main(String[] args) {
		FunctionOverloadingPgm fo=new FunctionOverloadingPgm();
		fo.getData();
		fo.getData("Vinothkumar");
		fo.getData("vinothkumar Selvaarasan", "Computer Science and Engineering");
	}
	

}
