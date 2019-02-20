package com.alishushu.bean;

import org.springframework.stereotype.Component;

@Component
public class Users {
    private String usersid;

    private String uname;

    private String upwd;

    private String idcard;

    private String phone;

    private String nickname;

    private String address;

    private String email;

    private String photo;

    private Integer integral;

    public String getUsersid() {
        return usersid;
    }
  
    public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Users [usersid=" + usersid + ", uname=" + uname + ", upwd="
				+ upwd + ", idcard=" + idcard + ", phone=" + phone
				+ ", nickname=" + nickname + ", address=" + address
				+ ", email=" + email + ", photo=" + photo + ", integral="
				+ integral + "]";
	}

	public Users(String usersid, String uname, String upwd, String idcard,
			String phone, String nickname, String address, String email,
			String photo, Integer integral) {
		super();
		this.usersid = usersid;
		this.uname = uname;
		this.upwd = upwd;
		this.idcard = idcard;
		this.phone = phone;
		this.nickname = nickname;
		this.address = address;
		this.email = email;
		this.photo = photo;
		this.integral = integral;
	}

	public void setUsersid(String usersid) {
        this.usersid = usersid == null ? null : usersid.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }
}