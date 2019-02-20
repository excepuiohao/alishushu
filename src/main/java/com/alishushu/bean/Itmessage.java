package com.alishushu.bean;

public class Itmessage {
    private String messageid;

    private String fromid;

    private String itemid;

    private String toid;

    private String messcontext;

    private String messtime;

    private String states;

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid == null ? null : messageid.trim();
    }

    public String getFromid() {
        return fromid;
    }

    public void setFromid(String fromid) {
        this.fromid = fromid == null ? null : fromid.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getToid() {
        return toid;
    }

    public void setToid(String toid) {
        this.toid = toid == null ? null : toid.trim();
    }

    public String getMesscontext() {
        return messcontext;
    }

    public void setMesscontext(String messcontext) {
        this.messcontext = messcontext == null ? null : messcontext.trim();
    }

    public String getMesstime() {
        return messtime;
    }

    public void setMesstime(String messtime) {
        this.messtime = messtime == null ? null : messtime.trim();
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states == null ? null : states.trim();
    }
}