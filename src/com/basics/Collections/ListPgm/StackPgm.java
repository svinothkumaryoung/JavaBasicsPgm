package com.basics.Collections.ListPgm;

import java.util.Stack;

public class StackPgm {
    Stack<String> stack=new Stack<String>();
    void addData()
    {
        stack.push("Java");
        stack.push("Spring");
        stack.push("Microservices");
        stack.push("aws");
        stack.push("devops");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println("Element on the top of the stack is "+stack.peek());
        System.out.println("Is stack is NULL "+stack.isEmpty());
        int i=stack.size();
        System.out.println("Size of the Stack is "+i);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        int j=stack.size();
        System.out.println("Size of the Stack is "+j);
        System.out.println("Is stack is NULL "+stack.isEmpty());


    }

    public static void main(String[] args) {
        StackPgm sp=new StackPgm();
        sp.addData();
    }
}
