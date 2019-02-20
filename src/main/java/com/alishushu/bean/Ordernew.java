package com.alishushu.bean;

import org.springframework.stereotype.Component;

@Component
public class Ordernew {
	private String itemid; 
	private String itemname;
	private String itempic;
	private String shopid;
	private String price;
	private String shopname;
	private String shopaddr;
	private String orderid;
	private String ordertime;
	private String recestate;
	private String shipstate;
	private String buyerid;
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getItempic() {
		return itempic;
	}
	public void setItempic(String itempic) {
		this.itempic = itempic;
	}
	public String getShopid() {
		return shopid;
	}
	public void setShopid(String shopid) {
		this.shopid = shopid;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getShopaddr() {
		return shopaddr;
	}
	public void setShopaddr(String shopaddr) {
		this.shopaddr = shopaddr;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public String getRecestate() {
		return recestate;
	}
	public void setRecestate(String recestate) {
		this.recestate = recestate;
	}
	public String getShipstate() {
		return shipstate;
	}
	public void setShipstate(String shipstate) {
		this.shipstate = shipstate;
	}
	public String getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(String buyerid) {
		this.buyerid = buyerid;
	}
	@Override
	public String toString() {
		return "Ordernew [itemid=" + itemid + ", itemname=" + itemname + ", itempic=" + itempic + ", shopid=" + shopid
				+ ", price=" + price + ", shopname=" + shopname + ", shopaddr=" + shopaddr + ", orderid=" + orderid
				+ ", ordertime=" + ordertime + ", recestate=" + recestate + ", shipstate=" + shipstate + ", buyerid="
				+ buyerid + "]";
	}
	public Ordernew() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
