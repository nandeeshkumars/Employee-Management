package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Employee;

@RestController
public class EmployeeController {

	@PostMapping("/empData")
	public String welcome(@RequestBody Employee emp) {
		return "Hi " + emp.getEmpId() + " name for " + emp.getEmpName() + " with amount " + emp.getEmpSalary()
				+ emp.getEmpDepartmentName1() + " successfully fetched - 1";
	}
}