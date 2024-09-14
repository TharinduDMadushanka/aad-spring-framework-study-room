package com.edu.tdm;

import com.edu.tdm.config.AppConfig;
import com.edu.tdm.entity.Employee;
import com.edu.tdm.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeService employeeService = context.getBean(EmployeeService.class);

        // create and save Employee
        Employee employee = new Employee();
        employee.setFirstName("Tdm");
        employee.setLastName("Shankar");
        employee.setEmail("john.doe@example.com");
        employeeService.saveEmployee(employee);

        System.out.println("==========================================");

        // Retrieve All Employees
        employeeService.getAllEmployees().forEach(emp -> {
            System.out.println("Employee ID: " + emp.getId());
            System.out.println("First Name: " + emp.getFirstName());
            System.out.println("Last Name: " + emp.getLastName());
            System.out.println("Email: " + emp.getEmail());
        });

        System.out.println("==========================================");

        // Get Employee by ID
        Employee emp = employeeService.getEmployeeById(1L);
        if (emp != null) {
            System.out.println("Found Employee: " + emp.getFirstName() + " " + emp.getLastName());
        }

        // Delete Employee
        employeeService.deleteEmployeeById(1L);

    }
}