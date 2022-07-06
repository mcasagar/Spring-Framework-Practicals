package com.sb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.sb.bo.CustomerBO;

public class CustomerDAOImpl implements ICustomerDAO {
	private static final String CUST_INSERT_QUERY = "INSERT INTO CUSTOMER_REGISTRATION VALUES(SP_CNO_SEQ.NEXTVAL,?,?,?,?,?,?)";
	//HAS - A Property 
	DataSource ds;
	
	public CustomerDAOImpl(DataSource ds) {
		System.out.println("CustomerDAOImpl :: 1-param constructor");
		this.ds = ds;
	}

	@Override
	public int insertCustomer(CustomerBO bo) throws Exception {
		System.out.println("CustomerDAOImpl.insertCustomer()");
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			//get pooled jdbc connection object
			con = ds.getConnection();
			//create prepared statement object having pre-compiled SQL query 
			ps = con.prepareStatement(CUST_INSERT_QUERY);
			//set value to query parameter 
			ps.setString(1, bo.getCname());
			ps.setString(2, bo.getAddrs());
			ps.setFloat(3, bo.getPrincipalAmount());
			ps.setFloat(4, bo.getRate());
			ps.setInt(5, bo.getTime());
			ps.setFloat(6, bo.getSimpleInterestAmount());
			//execute the query
			result = ps.executeUpdate();
			
		}catch(SQLException se) {
			se.printStackTrace();
			throw se; //exception re-throwing
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}//catch
		finally {
			//close all jdbc objects (resources)
			try {
				if(ps!=null)
					ps.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
		}//finally
		
		return result;
	}//method

}//class
