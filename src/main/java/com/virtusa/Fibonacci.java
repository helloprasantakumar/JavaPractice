package com.virtusa;

public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for (int i=2; i<n;i++){
            int c= a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }


        // Find the 10th Fibonacci Number

        int x=10;
        int y=0;
        int z=1;
        for(int m=2;m<=x;m++){
            int p=y+z;
            y= z;
            z=p;
        }
        System.out.println("\n"+x+"-th Fibonacci Number is : "+ z);
    }
}
