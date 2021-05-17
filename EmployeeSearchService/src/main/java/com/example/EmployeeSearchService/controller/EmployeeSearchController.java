package com.example.EmployeeSearchService.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeSearchService.Service.EmployeeSearchService;
import com.example.EmployeeSearchService.domain.model.Employee;

@RefreshScope  //loads the configuration properties value from the Config server.
@RestController
public class EmployeeSearchController {

	@Autowired
	 EmployeeSearchService employeeSearchService;
	
	@Autowired
	private ServerProperties serverProperties;

	 @RequestMapping("/employee/find/{id}")
	 public Employee findById(@PathVariable Long id) {
	  return employeeSearchService.findById(id);
	 }

	 @RequestMapping("/employee/findall")
	 public Collection < Employee > findAll() {
	  return employeeSearchService.findAll();
	 }
	 
	 @RequestMapping("/employee/text")
	 public String text() {
	  return serverProperties.getPort().toString();
	 }
}
