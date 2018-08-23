package cn.workshop.service.impl;

import cn.workshop.dao.impl.introduceMemberDaoImpl;
import cn.workshop.model.introduceMemberModel;
import cn.workshop.service.registerControl;

public class registerImpl implements registerControl {

	@Override
	public  boolean registerDeal(introduceMemberModel im) {
		// TODO Auto-generated method stub
		introduceMemberDaoImpl imd=new introduceMemberDaoImpl();
		if(imd.addIntroduceMember(im))
		{
			return true;
		}
		else
			return false;
	}
}
