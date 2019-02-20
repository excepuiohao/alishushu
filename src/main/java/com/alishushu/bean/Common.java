package com.alishushu.bean;

import org.springframework.stereotype.Component;

@Component
public class Common {
    private String commonid;

    private String shopsid;

    private String commcontext;

    private String commtime;

    private String morecomm;

    private String levels;

    private String usersid;

    public String getCommonid() {
        return commonid;
    }

    public void setCommonid(String commonid) {
        this.commonid = commonid == null ? null : commonid.trim();
    }

    public String getShopsid() {
        return shopsid;
    }

    public void setShopsid(String shopsid) {
        this.shopsid = shopsid == null ? null : shopsid.trim();
    }

    public String getCommcontext() {
        return commcontext;
    }

    public void setCommcontext(String commcontext) {
        this.commcontext = commcontext == null ? null : commcontext.trim();
    }

    public String getCommtime() {
        return commtime;
    }

    public void setCommtime(String commtime) {
        this.commtime = commtime == null ? null : commtime.trim();
    }

    public String getMorecomm() {
        return morecomm;
    }

    public void setMorecomm(String morecomm) {
        this.morecomm = morecomm == null ? null : morecomm.trim();
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels == null ? null : levels.trim();
    }

    public String getUsersid() {
        return usersid;
    }

    public void setUsersid(String usersid) {
        this.usersid = usersid == null ? null : usersid.trim();
    }
}