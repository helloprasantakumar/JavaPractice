package com.oops.polymorphism;

public class CompileTimePolyMorphism {

    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        CompileTimePolyMorphism ctpm= new CompileTimePolyMorphism();
        System.out.println(ctpm.add(2,3));
        System.out.println(ctpm.add(2.0,3.1));
        System.out.println(ctpm.add(5,6,7));
    }
}
