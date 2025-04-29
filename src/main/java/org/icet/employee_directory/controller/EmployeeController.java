
package org.icet.employee_directory.controller;
import org.icet.employee_directory.dto.Employee;
import org.icet.employee_directory.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")


public class EmployeeController {
    private final EmployeeService employeeService;


    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public String addEmployee (@RequestBody Employee employee) {
        boolean isAdded = employeeService.addEmployee(employee);;
        if (isAdded) {
            return "Employee added successfully!";
        } else {
            return "Failed to add employee.";
        }
    }

    @PutMapping("/update/{employee_id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String updateEmployee (@RequestBody Employee employee, @PathVariable Integer employee_id) {
        boolean isUpdated = employeeService.updateEmployee(employee, employee_id);
        if (isUpdated) {
            return "Employee updated successfully!";
        } else {
            return "Failed to update employee.";
        }
    }

    @GetMapping("/get-all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

//    @GetMapping
//    public ResponseEntity<List<Employee>> getAllEmployees() {
//        List<Employee> employees = employeeService.getAllEmployees();
//        return new ResponseEntity<>(employees, HttpStatus.OK);
//    }

    @DeleteMapping("/delete/{employee_id}")
    public String deleteEmployee (@PathVariable Integer employee_id) {
        boolean isDeleted = employeeService.deleteEmployee(employee_id);
        if (isDeleted) {
            return "Employee deleted successfully!";
        } else {
            return "Failed to delete employee.";
        }
    }

    @GetMapping("/get/{employee_id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Employee searchEmployee (@PathVariable Integer employee_id) {
        return employeeService.searchEmployee(employee_id);
    }





}

