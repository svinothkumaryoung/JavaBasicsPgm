package com.basics.DatePgm;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FindDateDifferences {
    SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
    Date date=new Date();
    String str=sdf.format(date);
    Scanner s=new Scanner(System.in);
    void CalcualteDate()  {
        System.out.println("Date is "+str);
        System.out.println("Enter your Date of Birth in format MM-dd-YYYY hh:mm:ss ");
        String dateFromUser=s.next();
        String str1=sdf.format(dateFromUser);
        try{
            Date d1=sdf.parse(str);
            Date d2=sdf.parse(str1);
            long TimeDifference=d2.getTime()-d1.getTime();
            System.out.println("Time Differenece is "+ TimeDifference);


        }
        catch (ParseException pe)
        {
            System.out.println(pe);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


    }

    public static void main(String[] args)  throws ParseException{
        FindDateDifferences fdd=new FindDateDifferences();
        fdd.CalcualteDate();
    }
}
