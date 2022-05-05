package com.basics.Collections.QueuePgm;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {
    PriorityQueue<String> pq=new PriorityQueue<String>();
    void addQueue()
    {
        pq.add("Vinoth");
        pq.add("Ashok");
        pq.add("roshan");

    }
    void ReteriveQueue()
    {
        Iterator<String> iterator=pq.iterator();
        while(iterator.hasNext())
        {
            System.out.println("Iterator Value is "+iterator.next());
        }
    }
    void removeQueue()
    {
        System.out.println(pq.poll());
        System.out.println("Elements in the Queue is after the Poll"+pq);
        System.out.println(pq.peek());
        System.out.println("Elements in the Queue is after Peek "+pq);
        //Peek is Return the minimum or first element and not going to remove from it
        //Poll is return the minimum or first element and remove it from the Queue
    }

    public static void main(String[] args) {
        PriorityQueue1 pq=new PriorityQueue1();
        pq.addQueue();
        pq.ReteriveQueue();
        pq.removeQueue();
    }
}
