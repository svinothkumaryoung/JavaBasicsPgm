package com.basics.MultilevelInheritance;

public class Subclass2 extends SubClass1 {
    String ManufacturerName;
    String RegisterOfficeNo;
    void getManuDeatils()
    {
        System.out.println("Enter the Manufacturer Name ");
        ManufacturerName=s.next();
        System.out.println("Enter the Register Corporate Office ");
        RegisterOfficeNo=s.next();
    }
    void printManuDetails()
    {
        System.out.println("Manufacturer Details "+ManufacturerName);
        System.out.println("Register Office No "+RegisterOfficeNo);
    }

    public static void main(String[] args) {
        Subclass2 sb=new Subclass2();
        sb.getOwnerDetails();
        sb.getDealerName();
        sb.getManuDeatils();
        sb.printOwnerDetails();
        sb.printDealerName();
        sb.printManuDetails();
    }
}
