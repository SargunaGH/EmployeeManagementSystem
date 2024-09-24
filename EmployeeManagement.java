package com.company.management;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManagement {
    private Map<String, Employee> employees;

    public EmployeeManagement() {
        employees = new HashMap<>();
    }

    // Add a new employee
    public void addEmployee(String employeeId, String name, String designation, double salary) {
        if (!employees.containsKey(employeeId)) {
            Employee employee = new Employee(employeeId, name, designation, salary);
            employees.put(employeeId, employee);
            System.out.println("Employee added successfully!");
        } else {
            System.out.println("Employee with this ID already exists.");
        }
    }

    // View an employee's details
    public void viewEmployee(String employeeId) {
        Employee employee = employees.get(employeeId);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Update an employee's details
    public void updateEmployee(String employeeId, String name, String designation, double salary) {
        Employee employee = employees.get(employeeId);
        if (employee != null) {
            employee.setName(name);
            employee.setDesignation(designation);
            employee.setSalary(salary);
            System.out.println("Employee details updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Remove an employee
    public void removeEmployee(String employeeId) {
        if (employees.containsKey(employeeId)) {
            employees.remove(employeeId);
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // View all employees
    public void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("\nAll Employees:");
            for (Employee employee : employees.values()) {
                System.out.println(employee);
            }
        }
    }
}
