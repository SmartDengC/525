package cn.workshop.service.impl;

import java.util.List;

import cn.workshop.dao.noticeInfo;
import cn.workshop.dao.impl.noticeInfoDaoImpl;
import cn.workshop.model.noticeInfoModel;

public class noticeInfoImpl implements noticeInfo {

	@Override
	public List<noticeInfoModel> queryNoticeInfo() {
		// TODO Auto-generated method stub
		//提取通知消息的前五条
		
		
		
		List<noticeInfoModel> list=null;
		noticeInfoDaoImpl nidi=new noticeInfoDaoImpl();
		list=nidi.queryNoticeInfo();
		return list;
	}

	
	//dao层创建时添加的接口方法
	
	
	@Override
	public Boolean addDownSource(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteDownSource(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean modifyDownSource(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	


}
