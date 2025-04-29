

package org.icet.employee_directory.service.impl;
import org.icet.employee_directory.service.EmployeeService;
import org.icet.employee_directory.dto.Employee;
import org.icet.employee_directory.repo.EmployeeRepo;
import org.icet.employee_directory.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return true;
    }

    @Override
    public boolean updateEmployee(Employee employee, Integer employee_id) {
        if(employeeRepo.existsById(employee_id)) {
            employee.setEmployee_id(employee_id);
            employeeRepo.save(employee);
            return true;
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee searchEmployee(Integer employee_id) {
        return employeeRepo.findById(employee_id).orElse(null);
    }

    @Override
    public boolean deleteEmployee(Integer employee_id) {
        if(employeeRepo.existsById(employee_id)) {
            employeeRepo.deleteById(employee_id);
            return true;
        }
        return false;
    }
}