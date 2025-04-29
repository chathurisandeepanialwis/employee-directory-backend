package org.icet.employee_directory;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class EmployeeDirectoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDirectoryApplication.class, args);
	}

}
