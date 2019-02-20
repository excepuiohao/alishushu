package com.alishushu.service;

import java.util.List;

import com.alishushu.bean.Messages;
import com.alishushu.bean.Pagese;
import com.alishushu.bean.Systeminfo;

public interface SysteminfoService {
	void insertmess(Systeminfo systeminfo);
	
    long countsystody();
    
    void ss();
    
    List<Messages> selectallmess();
    
    void deletesysmess(String systeminfoid);
    
    List<Messages> selectmesspage(Pagese pagese);
    
    int selectcountmess();
}
