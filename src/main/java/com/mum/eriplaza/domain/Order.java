package com.mum.eriplaza.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Order implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1778082691828807796L;

	@Id
	private long id;
	private long orderId;
	@OneToMany
	List<Item> itemsInOrder;
	@OneToOne
	private Address shippingAddress;
	@OneToOne
	private User user;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<Item> getItemsInOrder() {
		return itemsInOrder;
	}
	public void setItemsInOrder(List<Item> itemsInOrder) {
		this.itemsInOrder = itemsInOrder;
	}
	
}
