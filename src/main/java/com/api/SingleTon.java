package com.api;

public class SingleTon {
    int data=50;

    void change(SingleTon singleTon){
        singleTon.data=singleTon.data+100;
       // System.out.println(data);
    }

    public static void main(String[] args) {
        SingleTon singleTon = new SingleTon();
        System.out.println(singleTon.data);
        singleTon.change(singleTon);
        System.out.println(singleTon.data);
    }
}
