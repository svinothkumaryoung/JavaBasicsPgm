package com.basics.ExceptionPgm;
import java.util.Scanner;
public class SimpleExceptionPgm {
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
        catch (ArithmeticException ae)
        {
            System.out.println("Arithematic Exception Occur");
        }

        System.out.println("Welcome to Exception Handler Class ");
        System.out.println("I am blessed");
    }
    public static void main(String[] args) {
        SimpleExceptionPgm sep=new SimpleExceptionPgm();
        sep.getData();
    }
}
