package com.alishushu.bean;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class ItShOr {
	private Items items;
	 private Shop shop;
	 private Orderitem orderitem;
	public ItShOr() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Orderitem getOrderitem() {
		return orderitem;
	}
	public void setOrderitem(Orderitem orderitem) {
		this.orderitem = orderitem;
	}
	
	 
}
