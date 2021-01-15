package com.Goods.Entity;

import java.sql.Date;

public class Product {

	private int id;
	private String produtName;
	private String orgin;
	private int price;
	private int shelfLife;
	private Date manufDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProdutName() {
		return produtName;
	}

	public void setProdutName(String produtName) {
		this.produtName = produtName;
	}

	public String getOrgin() {
		return orgin;
	}

	public void setOrgin(String orgin) {
		this.orgin = orgin;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(int shelfLife) {
		this.shelfLife = shelfLife;
	}

	public Date getManufDate() {
		return manufDate;
	}

	public void setManufDate(Date manufDate) {
		this.manufDate = manufDate;
	}

	public Product(String produtName, String orgin, int price, int shelfLife, Date manufDate) {
		super();
		this.produtName = produtName;
		this.orgin = orgin;
		this.price = price;
		this.shelfLife = shelfLife;
		this.manufDate = manufDate;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [produtName=" + produtName + ", orgin=" + orgin + ", price=" + price + ", shelfLife="
				+ shelfLife + ", manufDate=" + manufDate + "]";
	}

}
