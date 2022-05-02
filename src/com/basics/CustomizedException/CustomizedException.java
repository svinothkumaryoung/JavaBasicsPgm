package com.basics.CustomizedException;

import java.io.IOException;
import java.util.Scanner;

public class CustomizedException {
    String productName;
    int quanity;
    Scanner s=new Scanner(System.in);
    void getData() throws ProductCustomizeException
    {
        System.out.println("Enter the Product Name ");
        productName=s.next();
        System.out.println("Enter the Product Quantity ");
        quanity=s.nextInt();
        if(quanity>=4)
        {
            throw new ProductCustomizeException("Only Maximum 4 Product allowed per order");
        }
        else{
            System.out.println("Happy Shopping");
        }
    }

    public static void main(String[] args)  {
        CustomizedException ce=new CustomizedException();
        try{
            ce.getData();
        }
        catch (ProductCustomizeException pce)
        {
            System.out.println(pce);
        }

    }
}
