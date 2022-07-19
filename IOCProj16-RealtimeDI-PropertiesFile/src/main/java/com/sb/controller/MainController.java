package com.sb.controller;

import com.sb.dto.EmployeeDTO;
import com.sb.service.IEmployeeMgmtService;
import com.sb.vo.EmployeeVO;

public class MainController {
	// HAS - A Property
	private IEmployeeMgmtService service;

	public MainController(IEmployeeMgmtService service) {
		System.out.println("MainController :: 1-param constructor");
		this.service = service;
	}
	
	public String processEmployee(EmployeeVO vo)throws Exception{
		//convert EmployeeVO class object to EmployeeDTO class object
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setDesg(vo.getDesg());
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		//use service
		String result = service.registerEmployee(dto);
		return result;
	}
	

}
