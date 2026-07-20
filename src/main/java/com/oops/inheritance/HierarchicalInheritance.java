package com.oops.inheritance;

class Employee1{
    void login(){
        System.out.println("Employee Login");
    }
}
class Developer1 extends Employee1{
    void code(){
        System.out.println("Developer Codes");
    }
}

class Tester1 extends Employee1{
    void   writeTestCase(){
        System.out.println(" Tester writes Test Case");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Developer1 developer= new Developer1();
        developer.login();
        developer.code();

        Tester1 tester= new Tester1();
        tester.login();
        tester.writeTestCase();

    }
}
