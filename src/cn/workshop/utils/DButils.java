package cn.workshop.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public  class DButils  {
	/**
	 * �������� ��ȡ���ݿ�����
	 */
	public Connection DBcon(){
		Connection con = null;
		  String driver="com.mysql.jdbc.Driver";
          String url="jdbc:mysql://localhost:3306/525gzs";
          String user="root";
          String password="123456";
          
          
          try {
              Class.forName(driver);//������������
              con = DriverManager.getConnection(url, user, password);
              //ʹ��DriveManager.getConnection();
              if (!con.isClosed()) {
                  System.out.println("���ݿ����ӳɹ�");
              }
          } catch (ClassNotFoundException e) {
              System.out.println("���ݿ�����û�а�װ");

          } catch (SQLException e) {
              System.out.println("���ݿ�����ʧ��");
          }
        
		return con;
	}
	//����statement�Ķ���
	public Statement DBstatement(Connection connection){
		Statement statement =null;
		try {
			statement=connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return statement;
		
	}
	//����resultset�Ķ���
	public ResultSet DBresultset(Statement statement,String sql){
		ResultSet resultset=null;
		//String spl=" ";
		try {
			resultset=statement.executeQuery("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultset;
		
	}
	
	
	
	
	public void closeDBCon(Connection connection, Statement statement,ResultSet resultSet){
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (statement != null) {
					try {
						statement.close();
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						if (connection != null) {
							try {
								connection.close();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
	}
	

}
