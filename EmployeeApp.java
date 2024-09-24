package com.company.management;

import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. View All Employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    String employeeId = sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter designation: ");
                    String designation = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    management.addEmployee(employeeId, name, designation, salary);
                    break;

                case 2:
                    System.out.print("Enter employee ID: ");
                    String viewEmployeeId = sc.nextLine();
                    management.viewEmployee(viewEmployeeId);
                    break;

                case 3:
                    System.out.print("Enter employee ID: ");
                    String updateEmployeeId = sc.nextLine();
                    System.out.print("Enter name: ");
                    String updateName = sc.nextLine();
                    System.out.print("Enter designation: ");
                    String updateDesignation = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double updateSalary = sc.nextDouble();
                    management.updateEmployee(updateEmployeeId, updateName, updateDesignation, updateSalary);
                    break;

                case 4:
                    System.out.print("Enter employee ID: ");
                    String removeEmployeeId = sc.nextLine();
                    management.removeEmployee(removeEmployeeId);
                    break;

                case 5:
                    management.viewAllEmployees();
                    break;

                case 6:
                    System.out.println("Exiting the system.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
