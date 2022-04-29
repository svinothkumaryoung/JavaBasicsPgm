package com.basics.arrayPgm;

import java.util.Scanner;

public class SimpleArray {
    int registerNo;
    String name;
    int marks[]=new int[6];//Declare and Define an Array in single Line
    Scanner s=new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter the Register Number ");
        registerNo=s.nextInt();
        System.out.println("Enter the Name ");
        name=s.next();
        for (int i=0;i<marks.length;i++)
        {
            System.out.println("Enter the Marks for Subject "+(i+1));
            marks[i]=s.nextInt();
        }
    }
    void printData()
    {
        System.out.println("The Register Number is "+registerNo);
        System.out.println("The Name is "+name);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Marks is "+marks[i]);
        }
    }

    public static void main(String[] args) {
        SimpleArray sa=new SimpleArray();
        sa.getData();
        sa.printData();
    }
}
