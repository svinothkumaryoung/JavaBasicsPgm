package com.basics.thiskeyword;

public class thisConstructor {
    int RegisterNo;
    String name;
    long mobileNo;
    thisConstructor()
    {
        RegisterNo=666;
        name="vinothkumar Selvaarasan";
        mobileNo=934408356;
        this.printData();
    }
    thisConstructor(int RegisterNo,String name,long mobileNo)
    {
        this();//this constuctor call should be the first Statement in the method
        this.RegisterNo=RegisterNo;
        this.name=name;
        this.mobileNo=mobileNo;
        this.printData();
    }
    void printData()
    {
        System.out.println("Register Number is "+RegisterNo);
        System.out.println("Name is "+name);
        System.out.println("Mobile No is "+mobileNo);
    }

    public static void main(String[] args) {
        thisConstructor thc=new thisConstructor(667,"Ashokkumar Selvaarasan",934408835);

    }

}
