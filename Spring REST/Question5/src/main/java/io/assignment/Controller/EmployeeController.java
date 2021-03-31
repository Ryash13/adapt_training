package io.assignment.Controller;

import io.assignment.Model.Employee;
import io.assignment.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity getAllEmployee() {
        employeeService.getAllEmployee();
        return new ResponseEntity(HttpStatus.FOUND);
    }

    @GetMapping("/emp/{id}")
    public ResponseEntity getEmployeeById(@PathVariable("id") long id) {
        employeeService.getEmployeeById(id);
        return new ResponseEntity(HttpStatus.FOUND);
    }

    @PostMapping("/add")
    public ResponseEntity addNewEmployee(@RequestBody Employee employee) {
        employeeService.addNewEmployee(employee);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteEmployee(@PathVariable("id") long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
        return new ResponseEntity(HttpStatus.OK);
    }

}
