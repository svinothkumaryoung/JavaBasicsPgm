package com.basics.thiskeyword;

public class thisMethods {
    int registerNo;
    String name;
    long mobileno;
    thisMethods(int registerNo,String name,long mobileno)
    {
        this.registerNo=registerNo;
        this.name=name;
        this.mobileno=mobileno;
        this.printData();
    }
    void printData(){
        System.out.println("Register No is "+registerNo);
        System.out.println("Name is "+name);
        System.out.println("Mobile Number is "+mobileno);
    }
    public static void main(String[] args) {
        thisMethods tm=new thisMethods(666,"Vinothkumar Selvaarasan",393939);
    }
}
