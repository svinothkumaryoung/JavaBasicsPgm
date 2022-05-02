package com.basics.Encapsulation;

import java.util.Scanner;

public class PrintInfo {
    Scanner s=new Scanner(System.in);
    EncapsulationClass ec=new EncapsulationClass();
    void getData()
    {
        System.out.println("Enter the Register Number ");
        ec.setRegisterNo(s.nextInt());
        System.out.println("Enter the Name");
        ec.setName(s.next());
    }
    void printData()
    {
        System.out.println("Register Number is "+ec.getRegisterNo());
        System.out.println("Name is "+ec.getName());
        System.out.println(ec);
    }

    public static void main(String[] args) {
        PrintInfo pi=new PrintInfo();
        pi.getData();
        pi.printData();
    }
}
