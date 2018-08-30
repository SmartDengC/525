package cn.workshop.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import cn.workshop.model.*;

import cn.workshop.dao.introduceMember;
import cn.workshop.dao.noticeInfo;
import cn.workshop.utils.DButils;

public class noticeInfoDaoImpl implements noticeInfo {

	@Override
	public List<noticeInfoModel> queryNoticeInfo() {
		Connection connection=null;
		Statement statement=null;
		ResultSet resultset =null;
		DButils conn=new DButils();
		connection = conn.DBcon();
		statement =conn.DBstatement(connection);
		String sql =" SELECT *FROM NOTICEINFO;;";
		try {
			resultset=statement.executeQuery(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		List<noticeInfoModel> list =new ArrayList<noticeInfoModel>();
		
		try {
			while(resultset.next()){
				noticeInfoModel info =new noticeInfoModel();
				info.setId(resultset.getString("id"));
				info.setTitle(resultset.getString("title"));
				info.setTime(resultset.getString("time"));
				info.setText(resultset.getString("text"));
				info.setPictureUrl(resultset.getString("pictureUrl"));
				list.add( info);
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public Boolean addNoticeinfo(noticeInfoModel ni) {
		DButils conn=new DButils();
		Connection connection =conn.DBcon();
		Statement statement =conn.DBstatement(connection);
		String sql="INSERT INTO NOTICEINFO (title,time,text,pictureUrl) VALUES ('"+ni.getTitle()+"','"+ni.getTime()+"','"+ni.getText()+"','"+ni.getPictureUrl()+"');";
		try {
			int  i=statement.executeUpdate(sql);
			statement.close();
			connection.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Boolean deleteNoticeinfo(String id) {
		DButils conn=new DButils();
		Connection connection =conn.DBcon();
		Statement statement=conn.DBstatement(connection);
		String sql="DELETE FROM NOTICEINFO WHERE ID="+id+";";
		try {
			int resultset=statement.executeUpdate(sql);
			statement.close();
			connection.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Boolean modifyNoticeinfo(noticeInfoModel ni) {
		DButils conn=new DButils();
		Connection connection =conn.DBcon();
		Statement statement =conn.DBstatement(connection);
		String sql="UPDATE NOTICEINFO  SET title='"+ni.getTitle()+"',time='"+ni.getTime()+"',text='"+ni.getText()+"',pictureUrl='"+ni.getPictureUrl()+"' WHERE ID="+ni.getId()+";";
		try {
			statement.execute(sql);
			statement.close();
			connection.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}






	

}
