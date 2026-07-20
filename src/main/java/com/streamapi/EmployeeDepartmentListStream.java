package com.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeDepartmentListStream {
    public static void main(String[] args) {

        List<Employee> employees= List.of(new Employee(1,"Amit","IT",80000,30,"Male"),
                new Employee(2,"Neha","HR",50000,28,"Female"),
                new Employee(3,"John","IT",90000,35,"Male"),
                new Employee(4,"Priya","Finance",70000,32,"Female"),
                new Employee(5,"Raj","IT",60000,25,"Male"),
                new Employee(6,"Sara","HR",55000,29,"Female"),
                new Employee(7,"David","Finance",95000,40,"Male"),
                new Employee(8, "Riya","IT",85000,31,"Female"));

        // Group employees by department
        Map<String, List<Employee>> groupEmployeesByDept= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(groupEmployeesByDept);

        // Count employees in each department
        Map<String, Long> employeeCountEachDept= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(employeeCountEachDept);

        // Average salary by department
        Map<String, Double> avgSalaryByDept= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryByDept);

        // Total salary by department
        Map<String, Double> totalSalaryByDept= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
        System.out.println(totalSalaryByDept);

        // Highest-paid employee in each department
        Map<String, Optional<Employee>> highestPaidEmployeeDeptWise= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(highestPaidEmployeeDeptWise);

        // Lowest-paid employee in each department

        Map<String,Optional<Employee>> lowestPaidEmployeeDeptWise = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(lowestPaidEmployeeDeptWise);

        // Highest salary in each department

        Map<String, Double> highestSalEachDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),emp -> emp.get().getSalary())));

        System.out.println(highestSalEachDept);


        // Employee names by department
        Map<String, List<String>> employeeNamesByDept= employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(employeeNamesByDept);

        // Partition employees by salary > 70000
        Map<Boolean, List<Employee>> result= employees.stream().collect(Collectors.partitioningBy(e-> e.getSalary()>70000));
        System.out.println(result);

        // Sort employees by salary
        List<Employee> sortedSalaryEmployees = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
        System.out.println(sortedSalaryEmployees);

        // Sort employees by salary Descending
        List<Employee> sortedSalaryEmployeesDesc= employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println(sortedSalaryEmployeesDesc);

        // Top 3 highest-paid employees
        List<Employee> top3HighestPaidSalary = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).toList();
        System.out.println(top3HighestPaidSalary);

        // Second-highest salary
        Employee secondHighestSalary= employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null);
        System.out.println(secondHighestSalary);

        // Department with the highest average salary
        Map.Entry<String, Double> departmentWithHighestAvgSal= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()).orElse(null);

        System.out.println(departmentWithHighestAvgSal);

        // Employees whose salary is greater than the average salary
        double averageSalary = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
        List<Employee> employeeWithSalGreatThanAvg= employees.stream().filter(e-> e.getSalary()>averageSalary).toList();
        System.out.println(employeeWithSalGreatThanAvg);




    }




}
