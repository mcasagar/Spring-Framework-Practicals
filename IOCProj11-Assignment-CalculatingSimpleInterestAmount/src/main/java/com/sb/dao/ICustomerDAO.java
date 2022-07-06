package com.sb.dao;

import com.sb.bo.CustomerBO;

public interface ICustomerDAO {
	public int insertCustomer(CustomerBO bo)throws Exception;
}
