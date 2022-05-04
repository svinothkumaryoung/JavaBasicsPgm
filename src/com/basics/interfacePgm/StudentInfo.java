package com.basics.interfacePgm;

import java.util.Scanner;

public class StudentInfo implements CollegeDetails {
    int RegisterNo;
    String name;
    Scanner s=new Scanner(System.in);
    @Override
    public void getDataInterface() {
        System.out.println("Enter the Register No ");
        RegisterNo=s.nextInt();
        System.out.println("Enter the Name ");
        name=s.next();
    }

    @Override
    public void printDataInterface() {
    System.out.println("Register Number is "+RegisterNo);
    System.out.println("Name is "+name);
    }

    public static void main(String[] args) {
        StudentInfo si=new StudentInfo();
        si.getDataInterface();
        si.printDataInterface();
    }
}
