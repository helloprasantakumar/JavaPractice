package com.design_pattern.prototype;

public class ProtoTypeExample {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("John");

        Employee empClone = emp.clone(); // deep copy
        System.out.println(empClone);

        Employee empClone3= empClone.clone(); // deep copy
        empClone3.setId(5);
        empClone3.setName("Biswa");
        System.out.println(empClone3);
        System.out.println(empClone);


        Employee empClone1 = empClone;  // shallow copy
        empClone1.setName("Prasanta");
        System.out.println(empClone);


    }
}
