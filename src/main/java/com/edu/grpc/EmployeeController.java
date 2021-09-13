package com.edu.grpc;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import helloworld.EmployeeGrpc;
import helloworld.EmployeeGrpc.EmployeeBlockingStub;
import helloworld.EmployeeReq;
import helloworld.EmployeeRes;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


@RestController
public class EmployeeController {

	@GetMapping("/employees")
	public static List<Employee> getAllEmployees() {
		return EmployeeServiceStub.getAllEmployees();
	}

	@GetMapping("/employee/{employeeId}")
	public static Employee getEmployeeById(@PathVariable Long employeeId) {
		return EmployeeServiceStub.getEmployeeById(employeeId);
	}

	@GetMapping("/employeeDetails")
	public static Employee getEmployeeDetails() {
		System.out.println("123");
		// TODO GRPC handle
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();

		EmployeeBlockingStub userStub = EmployeeGrpc.newBlockingStub(channel);
		
		EmployeeReq request = EmployeeReq.newBuilder().setId(2).build();
		
		EmployeeRes response = userStub.getEmployee(request);
		
		// get value from GRPC server (employeeId)
		Long employeeId = (long) response.getEmployeeId();
		System.out.println(employeeId);

//		Long employeeId = 1L;
		return EmployeeServiceStub.getEmployeeById(employeeId);
	}
}
