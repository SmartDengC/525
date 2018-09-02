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
			String sql =" SELECT *FROM downsource;;";
			List<downSourceModel> list =new ArrayList<downSourceModel>();
			
			
			try {
				resultset=statement.executeQuery(sql);
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
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			return list;

	}
	
	
	//以下是添加dao层时添加的unimplent method（意思就是 没有添加的接口方法）
	@Override
	public Boolean addDownSource(downSourceModel ds) {
		DButils conn=new DButils();
		Connection connection=conn.DBcon();
		//Statement statement=conn.DBstatement(connection);
		String sql="INSERT INTO downsource (name,introduce,time,url,pictureUrl) VALUES('"+ds.getName()+"','"+ds.getIntroduce()+"','"+ds.getTime()+"','"+ds.getUrl()+"','"+ds.getPictureUrl()+"');";
		Statement statement;
		statement=conn.DBstatement(connection);
		try {
			int resultset;
			resultset=statement.executeUpdate(sql);
			statement.close();
			connection.close();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			//e.printStackTrace();
		}
		
		return false;
	}


	@Override
	public Boolean deleteDownSource(String id) {
		DButils conn=new DButils();
		Connection connection=conn.DBcon();
		Statement statement=conn.DBstatement(connection);
		String sql="DELETE FROM downsource WHERE id="+id+";";
		try {
			int resultset=statement.executeUpdate(sql);
			statement.close();
			connection.close();
			//conn.closeDBCon(connection, statement, resultset);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public Boolean modifyDownSource(downSourceModel ds) {
		DButils conn=new DButils();
		Connection connection =conn.DBcon();
		Statement statement =conn.DBstatement(connection);
		String sql="UPDATE downsource SET name='"+ds.getName()+"',introduce='"+ds.getIntroduce()+"',time='"+ds.getTime()+"',url='"
				+ds.getUrl()+"',pictureUrl='"+ds.getPictureUrl()+"' where id="+ds.getId()+ ";";
		try {
			
			statement.execute(sql);
			
			statement.close();
			connection.close();
			return true;
			
		} catch (SQLException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		return false;
	}


	@Override
	public downSourceModel queryOneNoticeInfo(String id) {
		Connection connection=null;
		Statement statement=null;
		ResultSet resultset =null;
		DButils conn=new DButils();
		connection = conn.DBcon();
		statement =conn.DBstatement(connection);
		String sql ="SELECT *FROM downsource where id="+id+";";
		downSourceModel down =new downSourceModel();
		try {
			resultset=statement.executeQuery(sql);
			while(resultset.next()){				
				down.setId(resultset.getString("id"));
				down.setName(resultset.getString("name"));
				down.setIntroduce(resultset.getString("introduce"));
				down.setTime(resultset.getString("time"));
				down.setUrl(resultset.getString("url"));
				down.setPictureUrl(resultset.getString("pictureUrl"));				
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}				
		
			
		return down;
	}

	
	
}


