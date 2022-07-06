package com.sb.service;

import com.sb.dto.CustomerDTO;

public interface ICustomerMgmtService {
	public String registerCustomer(CustomerDTO dto)throws Exception;
}
