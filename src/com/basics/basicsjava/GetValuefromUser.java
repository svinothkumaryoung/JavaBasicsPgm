package com.basics.basicsjava;

import java.util.Scanner;

public class GetValuefromUser {
    int registerNo;
    String name;
    long mobileNo;
    Scanner s=new Scanner(System.in);//Read the input from the User
    public void getData()
    {
        System.out.println("Enter the Register Number ");
        registerNo=s.nextInt();
        System.out.println("Enter the Name ");
        name=s.next();
        System.out.println("Enter the Mobile Number ");
        mobileNo=s.nextLong();
    }
    public void printData()
    {
        System.out.println("Register Number is "+registerNo);
        System.out.println(" Name is "+name);
        System.out.println("Mobile Number is "+mobileNo);
    }
    public static void main(String[] args) {
        GetValuefromUser gvfu=new GetValuefromUser();
        gvfu.getData();
        gvfu.printData();
    }



}
