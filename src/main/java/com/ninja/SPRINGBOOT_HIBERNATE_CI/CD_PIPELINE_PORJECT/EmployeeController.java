package com.ninja.SPRINGBOOT_HIBERNATE_CI.CD_PIPELINE_PORJECT;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
	@Autowired
	EmployeeRepository erepo;
	@RequestMapping("/test")
	public String test()
	{
		return "This is a Test page ";
	}
	
	@PostMapping("/save")
	public String save(@RequestBody Employee employee)
	{
		erepo.save(employee);
		return "Data save in tables ";
	}
	
}
