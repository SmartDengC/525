package cn.workshop.service.impl;

import java.util.List;

import cn.workshop.dao.noticeInfo;
import cn.workshop.dao.impl.noticeInfoDaoImpl;
import cn.workshop.model.noticeInfoModel;

public class noticeInfoImpl implements noticeInfo {

	@Override
	public List<noticeInfoModel> queryNoticeInfo() {
		// TODO Auto-generated method stub
		//��ȡ֪ͨ��Ϣ��ǰ����
		
		
		
		List<noticeInfoModel> list=null;
		noticeInfoDaoImpl nidi=new noticeInfoDaoImpl();
		list=nidi.queryNoticeInfo();
		return list;
	}

	
	
	//���������dao��ʱ��ӵ�unimplent method����˼���� û����ӵĽӿڷ�����
	@Override
	public List<noticeInfoModel> addDownSource(String id) {
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
