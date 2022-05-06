package com.intermediate.polymorphismPgm;

class parent{
	void getData()
	{
		System.out.println("Parent Class");
	}
	
}
public class FunctionOverrining extends parent{
	void getData()
	{
		System.out.println("Child Class ");
	}
	public static void main(String[] args) {
		FunctionOverrining par=new FunctionOverrining();
		par.getData();
	}

}
