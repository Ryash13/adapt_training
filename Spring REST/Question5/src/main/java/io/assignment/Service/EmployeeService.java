package io.assignment.Service;

import io.assignment.Model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addNewEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployee(long id);
    void getAllEmployee();
    Employee updateEmployee(Employee employee);
}
