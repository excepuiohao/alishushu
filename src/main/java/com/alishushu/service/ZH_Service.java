package com.alishushu.service;

import java.util.List;

import com.alishushu.bean.Itmessage;
import com.alishushu.bean.Systeminfo;
import com.alishushu.bean.UserMessage;

public interface ZH_Service {

	public String FindAddressByBuyerid ( String Buyerid );
	
	public String FindAddressBySelerid(String Selerid);
	
	public int  FindMoneyByItemId(String ordertime,String Selerid);
	
	public List<Itmessage> FindMessage(String userid);
	
	public int DeleteMessage(String messageid);
	
	public int InsertMessage(String fromid, String itemid,String toid, String messcontext, String messtime,String status);
	
	public int UpdateMessage(String messageid);
	
	public List<Systeminfo> FindSysteminfo();
	public List<UserMessage> FindItmessage(String itemid);
	public String FindShopsid(String usersid);
}
