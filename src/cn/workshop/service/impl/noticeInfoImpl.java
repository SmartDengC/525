package cn.workshop.service.impl;

import java.util.List;

import cn.workshop.dao.impl.noticeInfoDaoImpl;
import cn.workshop.model.noticeInfoModel;
import cn.workshop.service.noticeInfoControl;

public class noticeInfoImpl implements noticeInfoControl {

	@Override
	public List<noticeInfoModel> getAllNoticeInfo() {
		// TODO Auto-generated method stub
		//��ȡ֪ͨ��Ϣ��ǰ����
		
		
		
				List<noticeInfoModel> list=null;
				
				noticeInfoDaoImpl nidi=new noticeInfoDaoImpl();
				list=nidi.queryNoticeInfo();
				return list;
	}

	@Override
	public Boolean addNoticeinfo(noticeInfoModel ni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteNoticeinfo(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean modifyNoticeinfo(noticeInfoModel ni) {
		// TODO Auto-generated method stub
		return null;
	}

	
	


}
