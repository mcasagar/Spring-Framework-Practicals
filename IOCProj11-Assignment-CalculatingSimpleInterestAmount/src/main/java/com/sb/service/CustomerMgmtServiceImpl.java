package com.sb.service;

import com.sb.bo.CustomerBO;
import com.sb.dao.ICustomerDAO;
import com.sb.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	//HAS - A Property
	ICustomerDAO dao;
	
	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		System.out.println("CustomerMgmtServiceImpl :: 1-param Constructor");
		this.dao = dao;
	}

	@Override
	public String registerCustomer(CustomerDTO dto) throws Exception {
		System.out.println("CustomerMgmtServiceImpl.registerCustomer()");
		float simpleInterestAmount = (dto.getPrincipleAmount()*dto.getRate()*dto.getTime())/100;
		//prepared BO class object having persistable data
		CustomerBO bo = new CustomerBO();
		bo.setCname(dto.getCname());
		bo.setAddrs(dto.getAddrs());
		bo.setPrincipalAmount(dto.getPrincipleAmount());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setSimpleInterestAmount(simpleInterestAmount);
		//use DAO
		int count = dao.insertCustomer(bo);
		//generate final result
		return count==1?"Customer Registered with SimpleInterestAmount :: "+simpleInterestAmount:"Customer not Register with simpleInterestAmount :: "+simpleInterestAmount;
		
	}//method
}//class
