package com.sb.service;

import com.sb.bo.EmployeeBO;
import com.sb.dao.IEmployeeDAO;
import com.sb.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	//HAS - A Property
	IEmployeeDAO dao;
	
	
	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) { 
		System.out.println("EmployeeMgmtServiceImpl :: 1-param constructor");
		this.dao = dao;
	}


	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		System.out.println("EmployeeMgmtServiceImpl.registerEmployee()");
		// write b.logic to calculate grossSalary and netSalary
		float grossSalary = dto.getBasicSalary() + dto.getBasicSalary()*0.4f; // +40% on BasicSalary
		float netSalary = grossSalary - dto.getBasicSalary() * 0.2f; // -20% on grossSalary
		//prepared BO class object having persistable data
		EmployeeBO bo = new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		//use DAO
		int count = dao.insertEmployee(bo);
		//generate final result
		return count==1?"Employee Registered with netSalary :: "+netSalary:" Employee not Register with netSalary :: "+netSalary;
		
	}

}
