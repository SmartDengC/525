package cn.workshop.service.impl;

import java.util.List;
import cn.workshop.dao.downSource;
import cn.workshop.dao.impl.downSourceDaoImpl;
import cn.workshop.model.downSourceModel;

public class dowmSourseImpl implements downSource {

	@Override
	public List<downSourceModel> queryDownSource() {
		// TODO Auto-generated method stub
		List<downSourceModel> list=null;
		downSourceDaoImpl dsl=new downSourceDaoImpl();
		list=dsl.queryDownSource();
		return list;
	}

}
