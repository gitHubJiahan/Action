package com.example;

/**
 * Created by Administrator on 2015/10/21 0021.
 */
public class MoreBasicThreads {
    public static void main(String args[])
    {
        for(int i=0;i<5 ;i++)
        {
            new Thread(new Liftoff()).start();

            System.out.println("Waiting for Liftoff");
        }
    }
}
