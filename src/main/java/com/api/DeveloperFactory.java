package com.api;

public class DeveloperFactory {
    public static  Developer getDetails(String devType){
        if(devType.equals("Java Developer")){
            return new C();
        } else if (devType.equals("Python Developer")) {
            return new D();
        }else{
            return null;
        }
    }
}
