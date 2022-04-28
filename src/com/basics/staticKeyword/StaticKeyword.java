package com.basics.staticKeyword;

public class StaticKeyword {
    static int count=0;
    int nonstatic=0;
    void increment()
    {
        count++;
        nonstatic++;
    }
    void printData()
    {
        System.out.println("Count Value is of static Keyword "+count);
        System.out.println("Count Value is of non static Keyword "+nonstatic);
    }

    public static void main(String[] args) {
        StaticKeyword skeyword=new StaticKeyword();
        skeyword.printData();
        skeyword.increment();
        skeyword.printData();
        skeyword.increment();
        skeyword.printData();
        System.out.println("New Objects");
        StaticKeyword skeyword1=new StaticKeyword();
        skeyword1.printData();
        skeyword1.increment();
        skeyword1.printData();
    }
}
