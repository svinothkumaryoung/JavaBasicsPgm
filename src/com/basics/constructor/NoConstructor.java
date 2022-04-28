package com.basics.constructor;
/*
In case there is no default Constructor is present.While Running program
compiler itself create default constructor and assign default value for the
variable.
 */
public class NoConstructor {
    int RegisterNo;
    String name;
    long MobileNo;

    void printData()
    {
        System.out.println("Register Number is "+RegisterNo);
        System.out.println("Name is "+name);
        System.out.println("Mobile Number is "+MobileNo);
    }

    public static void main(String[] args) {
        NoConstructor co=new NoConstructor();
        co.printData();
    }
}
