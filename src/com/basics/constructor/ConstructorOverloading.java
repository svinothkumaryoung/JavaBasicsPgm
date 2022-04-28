package com.basics.constructor;

public class ConstructorOverloading {
    int RegisterNo;
    String name;
    long MobileNo;
    ConstructorOverloading()//Default Constructor
    {
        RegisterNo=666;
        name="Vinothkumar Selvaarasan";
        MobileNo=93440856;
    }
    ConstructorOverloading(int r,String n,long m)// Constructor Overloading
    {
        RegisterNo=r;
        name=n;
        MobileNo=m;
    }
    void printData(){
        System.out.println("Register number is "+RegisterNo);
        System.out.println("Name "+name);
        System.out.println("Mobile Number is "+MobileNo);
    }

    public static void main(String[] args) {
        ConstructorOverloading co=new ConstructorOverloading();
        co.printData();
        ConstructorOverloading co1=new ConstructorOverloading(667,"Ashokkumer Selvaarasan",750228853);
        co1.printData();
    }
}
