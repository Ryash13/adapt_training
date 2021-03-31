package io.assignment.Repository;

import io.assignment.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee , Long> {
    Employee findAllById(long id);
}
