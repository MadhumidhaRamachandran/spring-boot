package com.Goods.Dao;

import java.util.List;

import com.Goods.Entity.Product;
import com.Goods.Entity.User;

public interface UserDao {

	public List<Product> getAllProduct();
	
	public List<User> getAllUser();
	
	public User getUser(User user);
	
}
