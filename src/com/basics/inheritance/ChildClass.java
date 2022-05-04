package com.basics.inheritance;

import java.util.Scanner;

class parentClass{
    int RegisterNo;
    String Name;
    Scanner s1=new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter the Register Number");
        RegisterNo=s1.nextInt();
        System.out.println("Enter the Name ");
        Name=s1.next();
    }
    void printData()
    {
        System.out.println("Register Number is "+RegisterNo);
        System.out.println("Name is "+Name);
    }
}

public class ChildClass extends parentClass {
    String Address;
    void getAddress()
    {
        System.out.println("Enter the Address ");
        Address=s1.next();
    }
    void printAddress()
    {
        System.out.println("Address "+Address);
    }

    public static void main(String[] args) {
        ChildClass cc=new ChildClass();
        cc.getData();
        cc.getAddress();
        cc.printData();
        cc.printAddress();
    }
}
