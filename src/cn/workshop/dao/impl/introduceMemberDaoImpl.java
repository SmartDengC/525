package cn.workshop.dao.impl;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import cn.workshop.dao.introduceMember;
import cn.workshop.utils.DButils;
import cn.workshop.model.introduceMemberModel;

public class introduceMemberDaoImpl implements introduceMember {

	@Override
	public List<introduceMemberModel> introduceMember() {
		Connection connection=null;
		Statement statement=null;
		ResultSet resultset =null;
		DButils conn=new DButils();
		connection = conn.DBcon();
		statement =conn.DBstatement(connection);
		String sql =" SELECT *FROM INTRODUCEMEMBER;";
		try {
			resultset=statement.executeQuery(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		List<introduceMemberModel> list =new ArrayList<introduceMemberModel>();
		
		try {
			while(resultset.next()){
				
				introduceMemberModel member=new introduceMemberModel();
				member.setId(resultset.getString("id"));
				member.setName(resultset.getString("Name"));
				member.setDuty(resultset.getString("Duty"));
				member.setIntroduce(resultset.getString("introduce"));
				member.setPictureUrl(resultset.getString("PictureUrl"));
				member.setContactInformation(resultset.getString("contactInformation"));
				member.setKey(resultset.getString("key"));
				list.add(member);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}



}
