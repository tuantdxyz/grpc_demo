package com.edu.grpc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceStub {

	private static Map<Long, Employee> employees = new HashMap<>();

	static {
		// list employee
		Employee emp1 = new Employee(1L, "empl1", "empl1@gmail.com", "0123456789", 1000L, "member");
		Employee emp2 = new Employee(2L, "empl2", "empl2@gmail.com", "0123456789", 2000L, "leader");
		employees.put(1L, emp1);
		employees.put(2L, emp2);
	}

	// get list employee
	public static List<Employee> getAllEmployees() {
		return new ArrayList<>(employees.values());
	}

	// get employee by id
	public static Employee getEmployeeById(Long employeeId) {
		return employees.get(employeeId);
	}
}
