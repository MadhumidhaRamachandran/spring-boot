package com.Goods.Entity;

public class User {

	private String email;
	private String name;
	private String city;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(String email, String name, String city, String password) {
		super();
		this.email = email;
		this.name = name;
		this.city = city;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", city=" + city + ", password=" + password + "]";
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	

}
