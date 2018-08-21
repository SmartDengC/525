package cn.workshop.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.workshop.dao.downSource;
import cn.workshop.dao.noticeInfo;
import cn.workshop.utils.DButils;

public class downSourceDaoImpl implements downSource {

	@Override
	public List<downSource> queryDownSource() {
			Connection connection=null;
			Statement statement=null;
			ResultSet resultset =null;
			DButils conn=new DButils();
			connection = conn.DBcon();
			statement =conn.DBstatement(connection);
			String sql =" SELECT *FROM INTRODUCEMEMBER;";
			resultset=conn.DBresultset(statement,sql);
			
			List<downSource> list =new ArrayList<downSource>();
			
			try {
				while(resultset.next()){
					cn.workshop.model.downSource down =new cn.workshop.model.downSource();
					down.setId(resultset.getString("id"));
					down.setName(resultset.getString("name"));
					down.setIntroduce(resultset.getString("introduce"));
					down.setTime(resultset.getString("time"));
					down.setUrl(resultset.getString("url"));
					down.setPictureUrl(resultset.getString("pictureUrl"));
					list.add((downSource) down);
					
				}
				return list;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			return list;

	}
}


