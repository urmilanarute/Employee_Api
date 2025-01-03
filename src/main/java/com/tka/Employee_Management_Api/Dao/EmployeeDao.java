package com.tka.Employee_Management_Api.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.Employee_Management_Api.model.Employee;

@Repository
public class EmployeeDao {

	List<Employee> employees = new ArrayList<Employee>();

	public EmployeeDao() {
		employees.add(new Employee(1, "Kumar", 29, "Pune", "HR"));
		employees.add(new Employee(2, "Lata", 37, "Mumbai", "Dev"));
	}

	public String AddEmployee(Employee employee) {
		employees.add(employee);
		return "Employee added";

	}

	public List<Employee> getAllEmpolyee() {
		return employees;

	}

	public Employee getempbyid(int empid) {
		for (Employee employee : employees) {
			if (employee.getEmpid() == empid) {
				return employee;
			}
		}
		return null;

	}

	public String deleteEmployee(int empid) {
		for (Employee employee : employees) {
			if (employee.getEmpid() == empid) {
				employees.remove(empid);
				return "Employee Deleted";
			}
		}

		return "Employee Not deleted";

	}

	public String updateemp(Employee updatedEmployee, int empid) {
		for (int i = 0; i < employees.size(); i++) {
			Employee employee = employees.get(i);
			if (employee.getEmpid() == empid) {
				employees.set(i, updatedEmployee);
				return "Employee updated successfully";
			}
		}
		return "Employee not found";
	}

}
