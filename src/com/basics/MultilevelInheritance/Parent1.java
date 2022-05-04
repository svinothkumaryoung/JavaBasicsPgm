package com.basics.MultilevelInheritance;

import java.util.Scanner;

//Owner DETAILS
public class Parent1 {
    String DrivingLicense;
    String OwnerName;
    Scanner s=new Scanner(System.in);
    void getOwnerDetails()
    {
        System.out.println("Enter the Driving License Number");
        DrivingLicense=s.next();
        System.out.println("Enter the Owner Name");
        OwnerName=s.next();
    }
    void printOwnerDetails()
    {
        System.out.println("Owner Name "+OwnerName);
        System.out.println("Driving License Number "+DrivingLicense);
    }
}
