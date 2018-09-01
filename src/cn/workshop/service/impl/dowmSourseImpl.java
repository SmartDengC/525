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
		downSourceDaoImpl dsl=new downSourceDaoImpl();
		//������֤
		if(ds!=null)
		{
			if(dsl.addDownSource(ds))
			{
				return true;
			}
			else
			{
				return false;
			}	
		}
		else
		{
			return false;
		}
			
	}

	@Override
	public Boolean modifyDownSource(downSourceModel ds) {
		// TODO Auto-generated method stub
		if(new downSourceDaoImpl().modifyDownSource(ds))
		{
			return true;
		}
		else
		{
			return false;
		}		
	}

	@Override
	public Boolean deleteDownSource(String id) {
		// TODO Auto-generated method stub
		if(new downSourceDaoImpl().deleteDownSource(id))
		{
			return true;
		}
		else
		{
			return false;
		}	
	}


	@Override
	public downSourceModel getOneDownSource(String id) {
		// TODO Auto-generated method stub
		downSourceDaoImpl dsdi=new downSourceDaoImpl();
		downSourceModel dsm=null;
		dsm=dsdi.queryOneNoticeInfo(id);
		return dsm;
		
	}
}
