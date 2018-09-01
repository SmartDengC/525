package cn.workshop.service.impl;

import java.util.List;

import cn.workshop.dao.impl.introduceMemberDaoImpl;
import cn.workshop.model.introduceMemberModel;
import cn.workshop.service.introduceMemberControl;

public class introduceMemberImpl implements introduceMemberControl {


	@Override
	public List<introduceMemberModel> getAllIntroduceMenber() {
		// TODO Auto-generated method stub
		List<introduceMemberModel> list=null;
		introduceMemberDaoImpl imdi=new introduceMemberDaoImpl();
		list=imdi.introduceMember();
		return list;
	}

	@Override
	public Boolean addIntroduceMember(introduceMemberModel im) {
		// TODO Auto-generated method stub
		if(new introduceMemberDaoImpl().addIntroduceMember(im))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public Boolean deleteIntroduceMember(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean modifyIntroduceMember(introduceMemberModel im) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public introduceMemberModel getOneIntroduceMenber() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
	
	

}
