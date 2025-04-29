package org.icet.employee_directory.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer employee_id;
    private String name;
    private String email;
    private String department;
}




