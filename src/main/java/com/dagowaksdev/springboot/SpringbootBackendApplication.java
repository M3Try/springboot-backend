package com.dagowaksdev.springboot;

import com.dagowaksdev.springboot.entity.Employee;
import com.dagowaksdev.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = Employee.builder()
				.firstName("dagowaks")
				.lastName("dev")
				.email("dagowaksdev@gmail.com")
				.build();

		Employee employee1 = Employee.builder()
				.firstName("dalband")
				.lastName("obi")
				.email("dalbandobi@gmail.com")
				.build();

		Employee employee2 = Employee.builder()
				.firstName("dominiq")
				.lastName("aigether")
				.email("dominiqaigether@gmail.com")
				.build();

		employeeRepository.save(employee);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
	}
}
