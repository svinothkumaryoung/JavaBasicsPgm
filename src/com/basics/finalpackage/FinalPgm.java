package com.basics.finalpackage;

public class FinalPgm {
    final int areaCode=666;
    final int empcode;
    FinalPgm()
    {
        empcode=2020;
    }
     void printData()
    {
        System.out.println("Area Code is "+areaCode);

    }

    public static void main(String[] args) {
        FinalPgm fp=new FinalPgm();
        fp.printData();
    }
}
