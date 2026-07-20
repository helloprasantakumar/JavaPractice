package com.exception;

public class TryCatchExample {
    public static void main(String[] args) {
        try{
            int i =10;
            int result= i/0;
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println("Cannot divide by zero.");
        }
    }
}
