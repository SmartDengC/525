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
					cn.workshop.model.noticeInfo info =new cn.workshop.model.noticeInfo();
					info.setId(resultset.getString("id"));
					info.setTitle(resultset.getString("title"));
					info.setTime(resultset.getString("time"));
					info.setText(resultset.getString("text"));
					info.setPictureUrl(resultset.getString("pictureUrl"));
					list.add((noticeInfo) info);
					
				}
				return list;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			return list;
		}
	}

}
