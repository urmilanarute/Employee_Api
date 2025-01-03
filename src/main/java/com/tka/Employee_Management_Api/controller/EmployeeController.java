package com.tka.Employee_Management_Api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Employee_Management_Api.model.Employee;
import com.tka.Employee_Management_Api.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/AddEmployee")
	public String AddEmployee(@RequestBody Employee employee) {
		String msg = employeeService.AddEmployee(employee);
		return msg;
	}
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@GetMapping("/getbyid/{empid}")
	public Employee getempbyid(@PathVariable int empid) {
		return employeeService.getempbyid(empid);

	}

	@DeleteMapping("/deleteemp/{empid}")
	public String deleteemployee(@PathVariable int empid) {
		return employeeService.deleteEmployee(empid);

	}

	@PutMapping("/updateemp/{empid}")
	public String updateemp(@PathVariable int empid, @RequestBody Employee employee) {
		return employeeService.updateemp(empid, employee);

	}
}
