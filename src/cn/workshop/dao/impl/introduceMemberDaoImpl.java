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
	

	
	//²âÊÔÖ÷º¯Êý
	public static void main(String[] args) {
		introduceMember i=new introduceMemberDaoImpl();
		List<introduceMemberModel> list= new ArrayList<introduceMemberModel>();
		list=i.introduceMember();
		for(introduceMemberModel member:list){
			System.out.println(member.getId()+"\n"+member.getName()+"\n"+member.getDuty()+"\n"+member.getIntroduce()+"\n"+member.getPictureUrl()+"\n"+member.getContactInformation()+"\n"+member.getKey());
			System.out.println("\n");
		}
			
		}



	@Override
	public Boolean addIntroduceMember(introduceMemberModel im) {
		DButils conn =new DButils();
		Connection connection  = conn.DBcon();
		Statement statement =conn.DBstatement(connection);
		String sql="INSERT INTO INTRODUCEMEMBER (NAME,DUTY,INTRODUCE,PICTUREURL,CONTACTINFORMATION,`KEY`)"
				+ " VALUES ('"+im.getName()+"','"+im.getDuty()+"','"
		+im.getIntroduce()+"','"+im.getPictureUrl()+"','"+im.getContactInformation()+"','"+im.getKey()+"');";
		try {
			int resultset=statement.executeUpdate(sql);
			statement.close();
			connection.close();
			return true;
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		return false;
	}



	@Override
	public Boolean deleteIntroduceMember(String id) {
		DButils conn=new DButils();
		Connection connection =conn.DBcon();
		Statement statement =conn.DBstatement(connection);
		String sql="DELETE FROM INTRODUCEMEMBER WHERE ID="+id+";";
		try {
			int resultset=statement.executeUpdate(sql);
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
	public Boolean modifyDownSource(introduceMemberModel im) {
		DButils conn=new DButils();
		Connection connection = conn.DBcon();
		Statement statement =conn.DBstatement(connection);
		String sql="UPDATE INTRODUCEMEMBER SET NAME='"+im.getName()+"',duty='"+im.getDuty()+"',introduce='"+im.getIntroduce()+"',pictureUrl='"
				+im.getPictureUrl()+"',contactInformation='"+im.getContactInformation()+"',`key`='"+im.getKey()+"' where id="+im.getId()+";";
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
