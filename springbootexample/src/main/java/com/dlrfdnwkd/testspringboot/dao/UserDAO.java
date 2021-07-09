package com.dlrfdnwkd.testspringboot.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dlrfdnwkd.testspringboot.model.User;

@Repository
public class UserDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public User findByName(String name) {
		String sql = "select * from user where name='"+name+"'";
		return jdbcTemplate.queryForObject(sql,new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException{
				User user = new User();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				return user;
			}
		});
	}
}
