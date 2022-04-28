package com.basics.staticKeyword;

public class StaticMethod {
    //int RegisterNo;
    static int studentCount=0;
    static void inc()
    {
        studentCount++;//Static method accept static variable.
    }
    static void printData()
    {
      System.out.println("Student Count is "+studentCount);
    }
    void printDat(){
        System.out.println(" Welcome to Java World ");
    }

    public static void main(String[] args) {
        inc();
        printData();
        StaticMethod sm=new StaticMethod();
        sm.printDat();

    }
}
