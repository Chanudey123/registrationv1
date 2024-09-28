package com.api;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();

        String st="";

        for(int i=str.length()-1;i>=0;i--){
             st=st+str.charAt(i);
        }
        if(str.equals(st)){
            System.out.println(str+" "+ "is a palindrome ");
        }else{
            System.out.println(str+" "+ "is not a palindrome ");
        }
    }
}
