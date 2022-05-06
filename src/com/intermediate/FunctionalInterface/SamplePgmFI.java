package com.intermediate.FunctionalInterface;




public class SamplePgmFI {
	@FunctionalInterface
	interface inter{
		void getData();
	}
	static inter it=()->{
		System.out.println("Welcome to Java 8 world");	
		};
	
	public static void main(String args[]) {
		it.getData();
	
	}

}


