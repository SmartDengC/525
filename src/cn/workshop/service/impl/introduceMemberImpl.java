package cn.workshop.service.impl;

import java.util.List;

import cn.workshop.dao.introduceMember;
import cn.workshop.dao.impl.introduceMemberDaoImpl;
import cn.workshop.model.introduceMemberModel;

public class introduceMemberImpl implements introduceMember {

	@Override
	public List<introduceMemberModel> introduceMember() {
		// TODO Auto-generated method stub
		List<introduceMemberModel> list=null;
		introduceMemberDaoImpl imdi=new introduceMemberDaoImpl();
		list=imdi.introduceMember();
		return list;
	}

	
	//dao�㴴��ʱ��ӵĽӿڷ���
	
	
	
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
