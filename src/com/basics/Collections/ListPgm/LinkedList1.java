package com.basics.Collections.ListPgm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedList1 {
    String name;
    Scanner S=new Scanner(System.in);
    List<String> StudentName1=new LinkedList<String>();
    void getData()
    {
        System.out.println("Enter the No of Student U want to Add");
        int size=S.nextInt();
        for(int i=0;i<size;i++)
        {
            StudentName1.add(S.next());
        }
    }
    void printData()
    {
        for(String stname:StudentName1)//For Each
        {

            System.out.println("The Data Present in Array List is "+stname);
        }
    }

    public static void main(String[] args) {
        LinkedList1 al1=new LinkedList1();
        al1.getData();
        al1.printData();
    }
}
