package com.basics.ExceptionPgm;

import java.util.Scanner;

public class FinallyBlock {
    int a,b,c;
    Scanner s=new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter the Value for A");
        a=s.nextInt();
        System.out.println("Enter the Value for B");
        b=s.nextInt();
        try{
            c=a/b;
            System.out.println("The output is "+c);
        }

        catch (NumberFormatException ae)
        {
            System.out.println("Number Format Exception Occur");
        }
        catch (Exception ae)
        {
            System.out.println(" Exception Occur");
        }
        finally {
            System.out.println("I am Finally Block");
        }

        System.out.println("Welcome to Exception Handler Class ");
        System.out.println("I am blessed");
    }
    public static void main(String[] args) {
        FinallyBlock sep=new FinallyBlock();
        sep.getData();
    }
}
