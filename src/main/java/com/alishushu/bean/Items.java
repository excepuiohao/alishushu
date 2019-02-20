package com.alishushu.bean;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;
@Component
public class Items {
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

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public String getIteminfo() {
        return iteminfo;
    }

    public void setIteminfo(String iteminfo) {
        this.iteminfo = iteminfo == null ? null : iteminfo.trim();
    }

    public String getItempic() {
        return itempic;
    }

    public void setItempic(String itempic) {
        this.itempic = itempic == null ? null : itempic.trim();
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
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
        this.putdate = putdate == null ? null : putdate.trim();
    }

    public String getDowndate() {
        return downdate;
    }

    public void setDowndate(String downdate) {
        this.downdate = downdate == null ? null : downdate.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels == null ? null : levels.trim();
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
}