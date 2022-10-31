package org.example;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("employee")
    public Employee getEmployeeDetails()
    {
        Employee employee=new Employee(getDepartmentDetail());
        employee.setEmployeeId(1);
        employee.setEmployeeName("Priyanka");
        employee.setEmployeeSalary(100000);
        return employee;
    }

    @Bean
    public Department getDepartmentDetail()
    {
        return new Department(1,"HR");
    }
}
