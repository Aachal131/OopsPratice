package com.praticeProblem;

public class Employee {
    String name;
    double salary;
    int id;

    // Constructor
    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
    public double calculateYearlySalary() {
        return salary * 12;
    }

    public void printNameAndSalary() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
    public static void main(String[] args){
        Employee employee1 = new Employee("Aachal Borole", 50000.0, 0);
        System.out.println("Yearly Salary: $" + employee1.calculateYearlySalary());//method call
        employee1.printNameAndSalary();

    }

}
