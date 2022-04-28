package com.basics.constructor;

public class Registeration {
    int registerNo;
    String name;
    Registeration() //Default Constructor
    {
        registerNo=6666;
        name="Vinothkumar Selvaarasan";
    }
    void printData()
    {
        System.out.println("Register Number is "+registerNo);
        System.out.println("Name is "+name);
    }

    public static void main(String[] args) {
        Registeration r=new Registeration();
        r.printData();
    }

}
