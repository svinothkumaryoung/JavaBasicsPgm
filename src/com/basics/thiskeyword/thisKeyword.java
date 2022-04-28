package com.basics.thiskeyword;
/*

 */
public class thisKeyword {
    int registerNo;
    String name;
    long mobileno;
    thisKeyword(int registerNo,String name,long mobileno)
    {
        this.registerNo=registerNo;
        this.name=name;
        this.mobileno=mobileno;
    }
    void printData(){
        System.out.println("Register No is "+registerNo);
        System.out.println("Name is "+name);
        System.out.println("Mobile Number is "+mobileno);
    }

    public static void main(String[] args) {
        thisKeyword tk=new thisKeyword(666,"Vinothkumar Selvaarasan",393939);
        tk.printData();
    }
}
