package com.basicsjava;

public class Registeration {
    int registerNo=100;// Datatype varaiablename
    String name="vinothkumar Selvaarasan";
    public void printdata()
    {
        System.out.println("Register Number is "+registerNo);
        System.out.println("Name is "+name);
    }
    public static void main(String args[]){
        Registeration reg=new Registeration();
        reg.printdata();

    }



}
