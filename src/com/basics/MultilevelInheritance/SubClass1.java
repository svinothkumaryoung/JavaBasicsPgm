package com.basics.MultilevelInheritance;

public class SubClass1  extends  Parent1{
    String DealerName;
    void getDealerName()
    {
        System.out.println("Enter the Dealer Name ");
        DealerName=s.next();
    }
    void printDealerName()
    {
        System.out.println("Dealer Name is "+DealerName);
    }
}
