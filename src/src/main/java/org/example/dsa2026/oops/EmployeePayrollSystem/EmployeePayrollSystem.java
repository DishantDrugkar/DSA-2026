package org.example.dsa2026.oops.EmployeePayrollSystem;

import java.util.ArrayList;

abstract class Employee{
    private String firstName;
    private String lastName;
    private int id;

    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    public abstract double calculateSalary();

}

class FullTimeEmployee extends Employee{

    private double monthlySalary;

    public FullTimeEmployee(String firstName, String lastName, int id, double monthlySalary) {
        super(firstName, lastName, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
       return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{

    private int hours;
    private int hourlyWorked;

    public PartTimeEmployee(String firstName, String lastName, int id, int hours, int hourlyWorked) {
        super(firstName, lastName, id);
        this.hours = hours;
        this.hourlyWorked = hourlyWorked;
    }

    @Override
    public double calculateSalary() {
        return hours * hourlyWorked;
    }
}

class PayrollSystem{
    private ArrayList<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        Employee removeToEmployee = null;
        for(Employee employee : employeeList){
            if(employee.getId() == id){
                removeToEmployee = employee;
                break;
            }
        }
        if(removeToEmployee != null){
            employeeList.remove(removeToEmployee);
        }
    }

    public void displayEmployee(){
        for(Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}
public class EmployeePayrollSystem {
    public static void main(String[] args) {
      PayrollSystem payrollSystem = new PayrollSystem();
      FullTimeEmployee emp1 = new FullTimeEmployee("Dishant","Drugkar",1,90000);
      PartTimeEmployee emp2 = new PartTimeEmployee("Smith", "John", 2, 28, 1200);

      payrollSystem.addEmployee(emp1);
      payrollSystem.addEmployee(emp2);
        System.out.println("Initial Employee");
        payrollSystem.displayEmployee();

        System.out.println("Removing Employee");
        payrollSystem.removeEmployee(2);
        payrollSystem.displayEmployee();
    }
}
