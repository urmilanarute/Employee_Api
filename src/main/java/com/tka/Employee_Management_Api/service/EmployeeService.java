package com.tka.Employee_Management_Api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tka.Employee_Management_Api.Dao.EmployeeDao;
import com.tka.Employee_Management_Api.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public String AddEmployee(Employee employee) {
		String msg = employeeDao.AddEmployee(employee);
		return msg;

	}

	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmpolyee();

	}

	public Employee getempbyid(@PathVariable int empid) {
		return employeeDao.getempbyid(empid);

	}

	public String deleteEmployee(int empid) {
		return employeeDao.deleteEmployee(empid);

	}

	public String updateemp(@PathVariable int empid, @RequestBody Employee employee) {
		return employeeDao.updateemp(employee, empid);

	}
}
