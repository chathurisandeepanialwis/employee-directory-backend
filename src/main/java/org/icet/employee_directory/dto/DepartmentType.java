

package org.icet.employee_directory.dto;

public enum DepartmentType {
    HR,
    IT,
    FINANCE,
    OPERATIONS;

    public String getDisplayName() {
        return switch (this) {
            case HR -> "HR";
            case IT -> "IT";
            case FINANCE -> "Finance";
            case OPERATIONS -> "Operations";
        };
    }
}

