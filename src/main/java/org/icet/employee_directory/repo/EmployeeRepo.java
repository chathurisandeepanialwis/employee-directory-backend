package org.icet.employee_directory.repo;
import org.icet.employee_directory.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}

