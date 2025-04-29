
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
@CrossOrigin

public class EmployeeController {
    private final EmployeeController employeeController;


    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public String addEmployee (@RequestBody Employee employee) {
        boolean isAdded = EmployeeService.addEmployee(employee);
        if (isAdded) {
            return "Employee added successfully!";
        } else {
            return "Failed to add employee.";
        }
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String updateEmployee (@RequestBody Employee employee, @PathVariable Integer id) {
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

    @DeleteMapping("/delete/{employee_id}")
    public String deleteEmployee (@PathVariable Integer employee_id) {
        boolean isDeleted = employeeService.deleteEmployee(employee_id);
        if (isDeleted) {
            return "Employee deleted successfully!";
        } else {
            return "Failed to delete employee.";
        }
    }

    @GetMapping("/get/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Employee searchEmployee (@PathVariable Integer id) {
        return employeeService.searchEmployee(id);
    }



}

