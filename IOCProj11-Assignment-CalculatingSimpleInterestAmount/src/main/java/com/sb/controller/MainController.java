package com.sb.controller;

import com.sb.dto.CustomerDTO;
import com.sb.service.ICustomerMgmtService;
import com.sb.vo.CustomerVO;

public class MainController {
	//HAS - Property
	private ICustomerMgmtService service;

	public MainController(ICustomerMgmtService service) {
		System.out.println("MainController :: 1-param constructor");
		this.service = service;
	}
	
	public String processCustomer(CustomerVO vo)throws Exception{
		//convert CustomerVO class object to CustomerDTO class object
		CustomerDTO dto = new CustomerDTO();
		dto.setCname(vo.getCname());
		dto.setAddrs(vo.getAddrs());
		dto.setPrincipleAmount(Float.parseFloat(vo.getPrincipalAmount()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Integer.parseInt(vo.getTime()));
		//use service
		String result = service.registerCustomer(dto);
		return result;
	}//method
	
}//class
