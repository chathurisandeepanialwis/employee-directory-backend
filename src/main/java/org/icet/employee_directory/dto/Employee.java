package org.icet.employee_directory.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")

public class Employee {
    @Id
    private Integer employee_id;
    private String name;
    private String email;
    @Enumerated(EnumType.STRING)  // Store enum as a string in DB
    @Column(nullable = false)
//    private DepartmentType department;
    private DepartmentType department;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = LocalDateTime.now();
    }
}




