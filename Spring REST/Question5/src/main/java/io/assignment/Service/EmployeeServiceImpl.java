package io.assignment.Service;

import io.assignment.Model.Employee;
import io.assignment.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addNewEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.findAllById(id);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void getAllEmployee() {
        employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee existing = employeeRepository.findById(employee.getEmployeeId()).get();
        existing.setEmployeeName(employee.getEmployeeName());
        existing.setEmployeeDepartment(employee.getEmployeeDepartment());
        existing.setEmployeeDesignation(employee.getEmployeeDesignation());
        existing.setEmployeeSalary(employee.getEmployeeSalary());
        return employeeRepository.save(existing);
    }
}
