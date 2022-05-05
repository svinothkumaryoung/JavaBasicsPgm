package com.basics.Collections.ListPgm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedList1 {
     String s1="NewGen";
    String name;
    Scanner S=new Scanner(System.in);
    List<String> StudentName1=new LinkedList<String>();
    void getData()
    {
        s1.concat(" Software");
        System.out.println(s1);
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
