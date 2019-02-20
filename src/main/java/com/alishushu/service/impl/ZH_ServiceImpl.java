package com.alishushu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alishushu.bean.Itmessage;
import com.alishushu.bean.Systeminfo;
import com.alishushu.bean.UserMessage;
import com.alishushu.mapper.ZH_Mapper;
import com.alishushu.service.ZH_Service;

@Service
public class ZH_ServiceImpl implements ZH_Service {
	@Autowired
	ZH_Mapper mapper;

	@Override
	public String FindAddressByBuyerid(String Buyerid) {
		// TODO Auto-generated method stub
		return mapper.FindAddressByBuyerid(Buyerid);
	}

	@Override
	public String FindAddressBySelerid(String Selerid) {
		// TODO Auto-generated method stub
		return mapper.FindAddressBySelerid(Selerid);
	}

	@Override
	public  int  FindMoneyByItemId(String ordertime,String Selerid) {
		// TODO Auto-generated method stub
		return mapper.FindMoneyByItemId(ordertime,Selerid);
	}

	@Override
	public List<Itmessage> FindMessage(String userid) {
		// TODO Auto-generated method stub
		return mapper.FindMessage(userid);
	}

	@Override
	public int DeleteMessage(String messageid) {
		// TODO Auto-generated method stub
		return mapper.DeleteMessage(messageid);
	}


	@Override
	public int UpdateMessage(String messageid) {
		// TODO Auto-generated method stub
		return mapper.UpdateMessage(messageid);
	}

	@Override
	public int InsertMessage(String fromid, String itemid, String toid, String messcontext, String messtime,String status) {
		// TODO Auto-generated method stub
		return mapper.InsertMessage(fromid, itemid, toid, messcontext, messtime,status);
	}

	@Override
	public List<Systeminfo> FindSysteminfo() {
		// TODO Auto-generated method stub
		return mapper.FindSysteminfo();
	}

	@Override
	public List<UserMessage> FindItmessage(String itemid) {
		// TODO Auto-generated method stub
		return mapper.FindItmessage(itemid);
	}

	@Override
	public String FindShopsid(String usersid) {
		// TODO Auto-generated method stub
		return mapper.FindShopsid(usersid);
	}

}
