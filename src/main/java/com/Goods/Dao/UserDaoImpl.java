package com.Goods.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.Goods.Entity.Product;
import com.Goods.Entity.User;
import com.Goods.RowMapper.ProductRowMapper;
import com.Goods.RowMapper.UserRowMapper;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<Product> getAllProduct() {
		String sql = "select * from product order by shelfLife desc";
		RowMapper<Product> mapper = new ProductRowMapper();
		return jdbc.query(sql, mapper);
	}

	@Override
	public List<User> getAllUser() {
		String sql = "select * from user";
		RowMapper<User> mapper = new UserRowMapper();
		return jdbc.query(sql, mapper);
	}

	@Override
	public User getUser(User user) {
		String sql = "select * from user where email=?";
		RowMapper<User> mapper = new BeanPropertyRowMapper<User>(User.class);
		User user1 = jdbc.queryForObject(sql, mapper, user.getEmail());
		if (user.getEmail().contentEquals(user1.getEmail())) {
			return user1;
		} else {
			user1 = null;
			return user1;
		}
	}
}
