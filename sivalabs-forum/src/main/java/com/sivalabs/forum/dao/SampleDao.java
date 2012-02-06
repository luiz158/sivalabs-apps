/**
 * 
 */
package com.sivalabs.forum.dao;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author SivaLabs
 *
 */
@Repository
public class SampleDao 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String getDefaultUserGreeting() 
	{
		try 
		{
			System.out.println("Using Database :"+this.jdbcTemplate.getDataSource().getConnection().getMetaData().getDatabaseProductName());
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return "Welcome to SpringMVC App!!!";
	}
	
}
