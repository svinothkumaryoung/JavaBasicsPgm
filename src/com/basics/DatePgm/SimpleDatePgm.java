package com.basics.DatePgm;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class SimpleDatePgm {
    SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
    void findDate()
    {
        LocalDate ld=LocalDate.now();
        System.out.println("Current Date "+ld);
        Date date=new Date();
        System.out.println("Current Date is using Java.util.Date "+date);
        String str=sdf.format(date);
        System.out.println("Date After the Format "+str);
        SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String str1=sdf1.format(date);
        System.out.println("Date After the Format "+str1);





    }

    public static void main(String[] args) {
        SimpleDatePgm sdp=new SimpleDatePgm();
        sdp.findDate();
    }
}
