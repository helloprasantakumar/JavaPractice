package com.oops.inheritance;


class Employee{
    void login(){
        System.out.println("Employee Login");
    }
}

class Developer extends Employee{
    void code(){
        System.out.println("Developer coding");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {
       Developer developer= new Developer();
       developer.code();
       developer.login();
    }


}
