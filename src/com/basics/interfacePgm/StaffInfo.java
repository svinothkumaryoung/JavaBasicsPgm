package com.basics.interfacePgm;

import java.util.Scanner;

public class StaffInfo implements CollegeDetails{
    int StaffId;
    String Staffname;
    Scanner s1=new Scanner(System.in);
    @Override
    public void getDataInterface() {
        System.out.println("Enter the Staffid ");
        StaffId=s1.nextInt();
        System.out.println("Enter the StaffName ");
        Staffname=s1.next();
    }

    @Override
    public void printDataInterface() {
        System.out.println("Staff Id "+StaffId);
        System.out.println("Staff Name "+Staffname);
    }
}
