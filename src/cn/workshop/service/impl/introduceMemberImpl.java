package cn.workshop.service.impl;

import java.util.List;

import cn.workshop.dao.introduceMember;
import cn.workshop.dao.impl.introduceMemberDaoImpl;

public class introduceMemberImpl implements introduceMember {

	@Override
	public List<introduceMember> introduceMember() {
		// TODO Auto-generated method stub
		List<introduceMember> list=null;
		introduceMemberDaoImpl imdi=new introduceMemberDaoImpl();
		list=imdi.introduceMember();
		return list;
	}

}
