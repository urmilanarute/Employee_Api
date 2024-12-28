package com.tka.Employee_Management_Api.model;

public class Employee {
	private int empid;
	private String empname;
	private int age;
	private String address;
	private String department;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String empname, int age, String address, String department) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.age = age;
		this.address = address;
		this.department = department;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", age=" + age + ", address=" + address
				+ ", department=" + department + "]";
	}
	
	
	

}
