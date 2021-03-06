package com.mum.eriplaza.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class User implements Serializable{

	
	
/**
	 * 
	 */
	private static final long serialVersionUID = -3794885616176050983L;

@Id
@GeneratedValue
private long id;

private String fname;
private String lname;
private String email;
private String phone;
//private String username;
private String password;

@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
@JoinColumn(name="addressid")
private Address address;

@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
private List<Item> items;


@OneToOne(fetch=FetchType.LAZY) 
@JoinColumn(name="USERNAME") 
private Credentials credentials;



public long getId() {
	return id;
}
public List<Item> getItems() {
	return items;
}
public void addItems(Item item) {
	items.add(item);
}
public void setId(long id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
//public String getUsername() {
//	return username;
//}
//public void setUsername(String username) {
//	this.username = username;
//}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Credentials getCredentials() {
	return credentials;
}
public void setCredentials(Credentials credentials) {
	this.credentials = credentials;
}




	
}
