package com.basics.arrayPgm;

import java.util.Scanner;

public class DynamicArray {
    int RegisterNo;
    String name;
    int marks[];
    int arraySize;
    int totalMarks;
    float percentage;
    Scanner s1=new Scanner(System.in);
    void readInput()
    {
        System.out.println("Enter the Register Number ");
        RegisterNo=s1.nextInt();
        System.out.println("Enter the Name ");
        name=s1.next();
        System.out.println("Enter the Array Size u want to Create ");
        arraySize=s1.nextInt();
        marks=new int[arraySize];
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter the Marks for the Subject "+(i+1));
            marks[i]=s1.nextInt();
        }
    }
    void printData()
    {
        System.out.println("The Register Number is "+RegisterNo);
        System.out.println("Name is "+name);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Marks of Subject "+(i+1)+" is "+marks[i]);
            totalMarks+=marks[i];
        }
        percentage=totalMarks/marks.length;
        System.out.println("Total Marks is "+totalMarks);
        System.out.println("Percentage is "+percentage);
    }

    public static void main(String[] args) {
        DynamicArray da=new DynamicArray();
        da.readInput();
        da.printData();
    }
}
