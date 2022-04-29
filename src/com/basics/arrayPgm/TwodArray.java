package com.basics.arrayPgm;

import java.util.Scanner;

public class TwodArray {
    String roomNo[][]=new String[2][3];
    Scanner s=new Scanner(System.in);
    void readData()
    {
        for(int i=0;i<roomNo.length;i++)
        {
            for(int j=0;j<roomNo[i].length;j++)
            {
                System.out.println("Enter the Product u want to Store in Room No "+(i+1)+(j+1));
                roomNo[i][j]=s.next();
            }
        }
    }
    void printdata()
    {
        for(int i=0;i<roomNo.length;i++)
        {
            for(int j=0;j<roomNo[i].length;j++)
            {
                System.out.println("The Product in Room No "+(i+1)+(j+1)+roomNo[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        TwodArray ta=new TwodArray();
        ta.readData();
        ta.printdata();
    }
}
