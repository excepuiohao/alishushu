package com.alishushu.bean;

import org.springframework.stereotype.Component;

@Component
public class Orderitem {
    private String orderid;

    private String ordertime;

    private String selerid;

    private String itemid;

    private String recestate;

    private String buyerid;

    private String shipstate;

    private String logistal;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime == null ? null : ordertime.trim();
    }

    public String getSelerid() {
        return selerid;
    }

    public void setSelerid(String selerid) {
        this.selerid = selerid == null ? null : selerid.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getRecestate() {
        return recestate;
    }

    public void setRecestate(String recestate) {
        this.recestate = recestate == null ? null : recestate.trim();
    }

    public String getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(String buyerid) {
        this.buyerid = buyerid == null ? null : buyerid.trim();
    }

    public String getShipstate() {
        return shipstate;
    }

    public void setShipstate(String shipstate) {
        this.shipstate = shipstate == null ? null : shipstate.trim();
    }

    public String getLogistal() {
        return logistal;
    }

    public void setLogistal(String logistal) {
        this.logistal = logistal == null ? null : logistal.trim();
    }
}