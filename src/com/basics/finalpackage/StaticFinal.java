package com.basics.finalpackage;

public class StaticFinal {
    static final int empcode;

    static {
        empcode=666;
    }
    void printdata()
    {
        System.out.println("Employee Code "+empcode);
    }

    public static void main(String[] args) {
        StaticFinal sf=new StaticFinal();
        sf.printdata();
    }
}
