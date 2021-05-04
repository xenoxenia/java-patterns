package com.company.java2_3;

import java.util.Arrays;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception{
        Setu<Integer> one = new Setu<>();
        Thread first = new Thread(()->{
            for (int i=0; i<100; i++){
                one.add(i);
            }
        });
        Thread second = new Thread(()->{
            for (int i=0; i<100; i++){
                one.add(i);
            }
        });
        first.start();
        second.start();
        Thread.sleep(3000);
        System.out.println(Arrays.toString(one.toArray()));
        System.out.println();
        Mapu<Integer,String> two=new Mapu<>();
        Thread first_2=new Thread(()->{
            for(int i=0;i<100;++i){
                two.put(i,"a");
            }
        });
        Thread second_2=new Thread(()->{
            for(int i=0;i<100;++i){
                two.put(i+100,"b");
            }
        });
        first_2.start();
        second_2.start();
        Thread.sleep(3000);
        for (Integer key : (Set<Integer>)two.keySet()) {
            System.out.printf(key + " " + two.get(key)+" | ");
        }
    }
}
