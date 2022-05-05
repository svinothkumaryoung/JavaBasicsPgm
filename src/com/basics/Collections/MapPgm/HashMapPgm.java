package com.basics.Collections.MapPgm;

import java.util.HashMap;
import java.util.Map;

public class HashMapPgm {
    HashMap<String,String> mapobj=new HashMap<String,String>();
    void addValue()
    {
        mapobj.put("RegisterNo","123");
        mapobj.put("Name","Vinothkumar Selvaarasan");
        mapobj.put("Department","CSE");
        mapobj.put("RegisterNo","124");
        for(Map.Entry me:mapobj.entrySet())
        {
           System.out.println("Key is "+me.getKey()+" Value is "+me.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapPgm hmp=new HashMapPgm();
        hmp.addValue();
    }
}
