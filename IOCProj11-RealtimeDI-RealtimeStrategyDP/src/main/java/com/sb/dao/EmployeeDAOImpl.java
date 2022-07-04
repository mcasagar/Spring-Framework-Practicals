package com.sb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.sb.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String EMP_INSERT_QUERY = "INSERT INTO REALTIMEDI_SPRING_EMPLOYEE VALUES(SP_ENO_SEQ.NEXTVAL,?,?,?,?,?)";
	//HAS - A Properties
	private DataSource ds;

	// alt + shift + o
	public EmployeeDAOImpl(DataSource ds) {
		System.out.println("EmployeeDAOImpl :: 1-param constructor");
		this.ds = ds;
	}

	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		System.out.println("EmployeeDAOImpl.insertEmployee()");
		Connection con = null;
		PreparedStatement ps = null;
		int result=0;
		try {
			//get pooled jdbc connection obj
			con = ds.getConnection();
			//create PreparedStatement object having pre-compiled SQL Query
			ps = con.prepareStatement(EMP_INSERT_QUERY);
			//set values to Query param
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());
			//execute the query
			result = ps.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se; //exception rethrowing
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			//close all resources
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

} //class
