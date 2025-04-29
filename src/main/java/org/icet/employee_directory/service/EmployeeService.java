package org.icet.employee_directory.service;
import org.icet.employee_directory.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    boolean addEmployee(Employee employee);
    boolean updateEmployee(Employee employee, Integer employee_id);
    List<Employee> getAllEmployees();
    Employee searchEmployee(Integer employee_id);
    boolean deleteEmployee(Integer employee_id);
    public Integer calc(Integer a, Integer b);
    public String getName(String name);
}



