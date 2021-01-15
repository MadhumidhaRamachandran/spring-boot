package com.Goods.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Goods.Entity.Product;

public class ProductRowMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product=new Product();
		product.setId(rs.getInt("id"));
		product.setProdutName(rs.getString("productName"));
		product.setOrgin(rs.getString("orgin"));
		product.setPrice(rs.getInt("price"));
		product.setManufDate(rs.getDate("manufDate"));
		product.setShelfLife(rs.getInt("shelfLife"));
		return product;
	}

	

}
