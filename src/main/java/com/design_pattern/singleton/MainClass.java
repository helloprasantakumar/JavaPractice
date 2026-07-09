package com.design_pattern.singleton;

public class MainClass {
    public static void main(String[] args) {
        SingleTonExample obj = SingleTonExample.getSingleTonExampleInstance();
        SingleTonExample obj1 = SingleTonExample.getSingleTonExampleInstance();
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
    }

}
