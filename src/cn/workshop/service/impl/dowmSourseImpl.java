package cn.workshop.service.impl;

import java.util.List;
import cn.workshop.dao.downSource;
import cn.workshop.dao.impl.downSourceDaoImpl;

public class dowmSourseImpl implements downSource {

	@Override
	public List<downSource> queryDownSource() {
		// TODO Auto-generated method stub
		List<downSource> list=null;
		downSourceDaoImpl dsl=new downSourceDaoImpl();
		list=dsl.queryDownSource();
		return list;
	}

}
