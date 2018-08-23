package cn.workshop.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import cn.workshop.dao.downSource;
import cn.workshop.model.downSourceModel;
import cn.workshop.model.noticeInfoModel;
import cn.workshop.utils.DButils;


public class downSourceDaoImpl implements downSource {

	@Override
	public List<downSourceModel> queryDownSource() {
			Connection connection=null;
			Statement statement=null;
			ResultSet resultset =null;
			DButils conn=new DButils();
			connection = conn.DBcon();
			statement =conn.DBstatement(connection);
			String sql =" SELECT *FROM DOWNSOURCE;;";
			try {
				resultset=statement.executeQuery(sql);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			List<downSourceModel> list =new ArrayList<downSourceModel>();
			
			try {
				while(resultset.next()){
					downSourceModel down =new downSourceModel();
					down.setId(resultset.getString("id"));
					down.setName(resultset.getString("name"));
					down.setIntroduce(resultset.getString("introduce"));
					down.setTime(resultset.getString("time"));
					down.setUrl(resultset.getString("url"));
					down.setPictureUrl(resultset.getString("pictureUrl"));
					list.add( down);
					
				}
				return list;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return list;

	}
	
	
	//以下是添加dao层时添加的unimplent method（意思就是 没有添加的接口方法）

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


