package com.alishushu.bean;

import java.math.BigDecimal;

public class NewPutdate {
	
	
	private String itemid;

    private String itemname;

    private String iteminfo;

    private String itempic;

    private String shopid;

    private String userid;

    private BigDecimal price;

    private String putdate;

    private String downdate;

    private String status;

    private String levels;

    private BigDecimal pageview;

    private BigDecimal itemcount;
    
    private String shopsid;

    private String shopaddr;

    private String shopname;

    private String usersid;

    private String star;

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

	public String getIteminfo() {
		return iteminfo;
	}

	public void setIteminfo(String iteminfo) {
		this.iteminfo = iteminfo;
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

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getPutdate() {
		return putdate;
	}

	public void setPutdate(String putdate) {
		this.putdate = putdate;
	}

	public String getDowndate() {
		return downdate;
	}

	public void setDowndate(String downdate) {
		this.downdate = downdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLevels() {
		return levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
	}

	public BigDecimal getPageview() {
		return pageview;
	}

	public void setPageview(BigDecimal pageview) {
		this.pageview = pageview;
	}

	public BigDecimal getItemcount() {
		return itemcount;
	}

	public void setItemcount(BigDecimal itemcount) {
		this.itemcount = itemcount;
	}

	public String getShopsid() {
		return shopsid;
	}

	public void setShopsid(String shopsid) {
		this.shopsid = shopsid;
	}

	public String getShopaddr() {
		return shopaddr;
	}

	public void setShopaddr(String shopaddr) {
		this.shopaddr = shopaddr;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getUsersid() {
		return usersid;
	}

	public void setUsersid(String usersid) {
		this.usersid = usersid;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public NewPutdate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NewPutdate(String itemid, String itemname, String iteminfo, String itempic, String shopid, String userid,
			BigDecimal price, String putdate, String downdate, String status, String levels, BigDecimal pageview,
			BigDecimal itemcount, String shopsid, String shopaddr, String shopname, String usersid, String star) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.iteminfo = iteminfo;
		this.itempic = itempic;
		this.shopid = shopid;
		this.userid = userid;
		this.price = price;
		this.putdate = putdate;
		this.downdate = downdate;
		this.status = status;
		this.levels = levels;
		this.pageview = pageview;
		this.itemcount = itemcount;
		this.shopsid = shopsid;
		this.shopaddr = shopaddr;
		this.shopname = shopname;
		this.usersid = usersid;
		this.star = star;
	}

	@Override
	public String toString() {
		return "NewPutdate [itemid=" + itemid + ", itemname=" + itemname + ", iteminfo=" + iteminfo + ", itempic="
				+ itempic + ", shopid=" + shopid + ", userid=" + userid + ", price=" + price + ", putdate=" + putdate
				+ ", downdate=" + downdate + ", status=" + status + ", levels=" + levels + ", pageview=" + pageview
				+ ", itemcount=" + itemcount + ", shopsid=" + shopsid + ", shopaddr=" + shopaddr + ", shopname="
				+ shopname + ", usersid=" + usersid + ", star=" + star + "]";
	}
    

}
