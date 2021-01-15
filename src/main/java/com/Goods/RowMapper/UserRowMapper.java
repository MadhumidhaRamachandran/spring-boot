package com.Goods.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Goods.Entity.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user=new User();
		user.setEmail(rs.getString("email"));
		user.setName(rs.getString("name"));
		user.setCity(rs.getString("city"));
		user.setPassword(rs.getString("password"));
		return null;
	}

}
