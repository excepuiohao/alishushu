package com.alishushu.bean;

import org.springframework.stereotype.Component;

@Component
public class Shop {
    private String shopsid;

    private String shopaddr;

    private String shopname;

    private String usersid;

    private String star;

    public String getShopsid() {
        return shopsid;
    }

    public void setShopsid(String shopsid) {
        this.shopsid = shopsid == null ? null : shopsid.trim();
    }

    public String getShopaddr() {
        return shopaddr;
    }

    public void setShopaddr(String shopaddr) {
        this.shopaddr = shopaddr == null ? null : shopaddr.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getUsersid() {
        return usersid;
    }

    public void setUsersid(String usersid) {
        this.usersid = usersid == null ? null : usersid.trim();
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star == null ? null : star.trim();
    }
}