package cn.workshop.service.impl;

import java.util.List;

import cn.workshop.dao.noticeInfo;
import cn.workshop.dao.impl.noticeInfoDaoImpl;

public class noticeInfoImpl implements noticeInfo {

	@Override
	public List<noticeInfo> queryNoticeInfo() {
		// TODO Auto-generated method stub
		//��ȡ֪ͨ��Ϣ��ǰ����
		
		
		
		List<noticeInfo> list=null;
		noticeInfoDaoImpl nidi=new noticeInfoDaoImpl();
		list=nidi.queryNoticeInfo();
		return list;
	}

}
