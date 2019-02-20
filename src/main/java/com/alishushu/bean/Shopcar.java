package com.alishushu.bean;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;
@Component
public class Shopcar {
    private String userid;

    private String itemid;

    private BigDecimal itemcount;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public BigDecimal getItemcount() {
        return itemcount;
    }

    public void setItemcount(BigDecimal itemcount) {
        this.itemcount = itemcount;
    }
}