package org.example;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        // Create a new employee
        Employee employee = new Employee("Maven Java", "Developer", 80000, new Date());
        employeeData.createEmployee(employee);

        // Retrieve and display an employee by ID
        Employee retrievedEmployee = employeeData.getEmployeeById(1);
        System.out.println(retrievedEmployee);

        // Retrieve and display all employees
        System.out.println("All Employees:");
        for (Employee e : employeeData.getAllEmployees()) {
            System.out.println(e);
        }

        // Update an employee
        retrievedEmployee.setPosition("Senior Developer");
        retrievedEmployee.setSalary(90000);
        employeeData.updateEmployee(retrievedEmployee);

        // Delete an employee
        employeeData.deleteEmployee(1);
    }
}
