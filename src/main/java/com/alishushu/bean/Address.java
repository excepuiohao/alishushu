package com.alishushu.bean;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String addid;

    private String usersid;

    private String address;

    private String phone;

    private String name;

    public String getAddid() {
        return addid;
    }

    public void setAddid(String addid) {
        this.addid = addid == null ? null : addid.trim();
    }

    public String getUsersid() {
        return usersid;
    }

    public void setUsersid(String usersid) {
        this.usersid = usersid == null ? null : usersid.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}