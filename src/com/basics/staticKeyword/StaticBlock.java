package com.basics.staticKeyword;
/*
Static block is going to execute before the constructor.

Syntax:
static()
{
}
 */
public class StaticBlock {
    static {
        System.out.println("I am Static Block");
    }
    static {
        System.out.println("I am Static Block-1");
    }
    StaticBlock()
    {
        System.out.println("I am a constructor");
    }
    static {
        System.out.println("I am Static Block-2");
    }

    public static void main(String[] args) {
        StaticBlock sb=new StaticBlock();
    }
}
