package cn.workshop.service.impl;

import java.util.List;
import cn.workshop.dao.impl.downSourceDaoImpl;
import cn.workshop.model.downSourceModel;
import cn.workshop.service.downSourceControl;

public class dowmSourseImpl implements downSourceControl {

	@Override
	public List<downSourceModel> getAllDownSource() {
		// TODO Auto-generated method stub
		List<downSourceModel> list=null;
		downSourceDaoImpl dsl=new downSourceDaoImpl();
		list=dsl.queryDownSource();
		return list;
	}

	@Override
	public Boolean addDownSource(downSourceModel ds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean modifyDownSource(downSourceModel ds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteDownSource(String id) {
		// TODO Auto-generated method stub
		return null;
	}



	

}
