package com.intermediate.autoboxing;

public class AutoBoxingUnBoxing {
	
	int i=10;
	short s=30;
	float marks=90.0f;
	double percentage=90.3D;
	char gender='m';
	
	Integer it;
	Short sh;
	Float m;
	Double d;
	Character c;
	void autoboxingMethod()
	{
		//Autoboxing is used to convert the Primitive datatype to Wrapper datatype
		
		 it=i;
		 sh=s;
		 m=marks;
		 d=percentage;
		 c=gender;
		System.out.println("Interger Wrapper Value is "+it);
		System.out.println("Short Wrapper Value is "+sh);
		System.out.println("Float Wrapper Value is "+m);
		System.out.println("Double Wrapper Value is "+d);
		System.out.println("Character Wrapper Value is "+c);
	}
	void unboxing()
	{
		//Convert wrapper datatype to primitiveDatatype
		i=it;
		s=sh;
		marks=m;
		percentage=d;
		gender=c;
		System.out.println("int Value is "+i);
		System.out.println("short Value is "+s);
		System.out.println("float Value is "+marks);
		System.out.println("double Value is "+percentage);
		System.out.println("char Value is "+gender);
		
	}
	public static void main(String[] args) {
		AutoBoxingUnBoxing au=new AutoBoxingUnBoxing();
		au.autoboxingMethod();
		au.unboxing();
	}
	
	
	
}
