package cn.workshop.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import cn.workshop.dao.introduceMember;
import cn.workshop.utils.DButils;
import cn.workshop.model.*;

public class introduceMemberDaoImpl implements introduceMember {

	@Override
	public List<cn.workshop.dao.introduceMember> introduceMember() {
		Connection connection=null;
		Statement statement=null;
		ResultSet resultset =null;
		DButils conn=new DButils();
		connection = conn.DBcon();
		statement =conn.DBstatement(connection);
		String sql =" SELECT *FROM INTRODUCEMEMBER;";
		resultset=conn.DBresultset(statement,sql);
		
		List<introduceMember> list =new ArrayList<introduceMember>();
		
		try {
			while(resultset.next()){
				cn.workshop.model.introduceMember member=new cn.workshop.model.introduceMember();
				member.setId(resultset.getString("id"));
				member.setName(resultset.getString("Name"));
				member.setDuty(resultset.getString("Duty"));
				member.setIntroduce(resultset.getString("introduce"));
				member.setPictureUrl(resultset.getString("PictureUrl"));
				member.setContactInformation(resultset.getString("contactInformation"));
				member.setKey(resultset.getString("key"));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
