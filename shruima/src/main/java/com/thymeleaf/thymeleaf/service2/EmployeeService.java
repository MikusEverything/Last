package com.thymeleaf.thymeleaf.service2;


import java.util.List;

import com.thymeleaf.thymeleaf.entity.mode.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployee();
	void save(Employee employee);
	Employee getById(Long id);
	void deleteViaId(long id);
}

