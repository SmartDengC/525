package cn.workshop.service.impl;

import java.util.List;

import cn.workshop.dao.impl.noticeInfoDaoImpl;
import cn.workshop.model.noticeInfoModel;
import cn.workshop.service.noticeInfoControl;

public class noticeInfoImpl implements noticeInfoControl {

	@Override
	public List<noticeInfoModel> getAllNoticeInfo() {
		// TODO Auto-generated method stub
		//提取通知消息的前五条					
		List<noticeInfoModel> list=null;
		
		noticeInfoDaoImpl nidi=new noticeInfoDaoImpl();
		list=nidi.queryNoticeInfo();
		return list;
	}

	@Override
	public Boolean addNoticeinfo(noticeInfoModel ni) {
		// TODO Auto-generated method stub
		noticeInfoDaoImpl nidi=new noticeInfoDaoImpl();
		if(nidi.addNoticeinfo(ni))
			return true;
		else
			return false;
	}

	@Override
	public Boolean deleteNoticeinfo(String id) {
		// TODO Auto-generated method stub
		noticeInfoDaoImpl nidi=new noticeInfoDaoImpl();
		if(nidi.deleteNoticeinfo(id))
			return true;
		else
			return false;
			
	}

	@Override
	public Boolean modifyNoticeinfo(noticeInfoModel ni) {
		// TODO Auto-generated method stub
		noticeInfoDaoImpl nidi=new noticeInfoDaoImpl();
		if(nidi.modifyNoticeinfo(ni))
			return true;
		else
			return false;
	}

	@Override
	public noticeInfoModel getOneNoticeInfo(String id) {
		// TODO Auto-generated method stub
		noticeInfoModel nim=null;
		noticeInfoDaoImpl nidi=new noticeInfoDaoImpl();
		 nim=nidi.queryOneNoticeInfo(id);			
		return nim;
	}

	
	


}
