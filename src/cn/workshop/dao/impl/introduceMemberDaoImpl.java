package cn.workshop.dao.impl;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import cn.workshop.dao.introduceMember;
import cn.workshop.utils.DButils;
import cn.workshop.model.downSourceModel;
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
		String sql =" SELECT *FROM introducemember;";
		List<introduceMemberModel> list =new ArrayList<introduceMemberModel>();
//		OutputStream os = null;
//		  try {
//			  os = new FileOutputStream("/usr/local/io3.txt");
//		  } catch (FileNotFoundException e1) {
//			// TODO 自动生成的 catch 块
//			  e1.printStackTrace();
//		  }
//        PrintWriter pw=new PrintWriter(os);
		
		
		try {
			resultset=statement.executeQuery(sql);
			if(resultset.next()) {
				while(resultset.next()){
					
					introduceMemberModel member=new introduceMemberModel();
					member.setId(resultset.getString("id"));
					member.setName(resultset.getString("name"));
					member.setDuty(resultset.getString("duty"));
					member.setIntroduce(resultset.getString("introduce"));
					member.setPictureUrl(resultset.getString("pictureUrl"));
					member.setContactInformation(resultset.getString("contactInformation"));
					member.setKey(resultset.getString("key"));
					list.add(member);
				}
			}
			resultset.close();
			statement.close();
			connection.close();
			//pw.write("list没问题");
			return list;
		} catch (SQLException e1) {
			//pw.write("list有问题 "+e1);
			e1.printStackTrace();
		}
		
		
//		 pw.close();
//         try {
// 			os.close();
// 		  } catch (IOException e1) {
// 			  // TODO 自动生成的 catch 块
// 			  e1.printStackTrace();
// 		  }
		return list;
	}
	

	
	//测试主函数
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
		String sql="INSERT INTO introducemember (name,duty,introduce,pictureUrl,contactInformation,`key`)"
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
		String sql="DELETE FROM introducemember WHERE id="+id+";";
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
		String sql="UPDATE introducemember SET name='"+im.getName()+"',duty='"+im.getDuty()+"',introduce='"+im.getIntroduce()+"',pictureUrl='"
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



	@Override
	public introduceMemberModel queryOneNoticeInfo(String id) {
		Connection connection=null;
		Statement statement=null;
		ResultSet resultset =null;
		DButils conn=new DButils();
		connection = conn.DBcon();
		statement =conn.DBstatement(connection);
		String sql ="SELECT *FROM introducemember where id="+id+";";
		introduceMemberModel intro =new introduceMemberModel();
		try {
			resultset=statement.executeQuery(sql);
			if(resultset.next()) {
				while(resultset.next()){				
					intro.setId(resultset.getString("id"));
					intro.setName(resultset.getString("name"));
					intro.setDuty(resultset.getString("duty"));
					intro.setIntroduce(resultset.getString("introduce"));
					intro.setPictureUrl(resultset.getString("pictureUrl"));
					intro.setContactInformation(resultset.getString("contactInformation"));
					intro.setKey(resultset.getString("key"));				
				}
			}
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}				
		
			
		return intro;
	}




}
