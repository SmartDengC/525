package cn.workshop.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public  class DButils  {
	/**
	 * 加载驱动 获取数据库连接
	 */
	public Connection DBcon(){
		Connection con = null;
		  String driver="com.mysql.jdbc.Driver";
          String url="jdbc:mysql://localhost:3306/525gzs";
          String user="root";
          String password="123456";
          
      
          try {
              Class.forName(driver);//加载连接驱动
              con = DriverManager.getConnection(url, user, password);
              //使用DriveManager.getConnection();
              if (!con.isClosed()) {
                  System.out.println("数据库连接成功");
              }
          } catch (ClassNotFoundException e) {
              System.out.println("数据库驱动没有安装");      

          } catch (SQLException e) {
              System.out.println("数据库连接失败");
          }
        

          
		return con;
	}
	//创建statement的对象
	public Statement DBstatement(Connection connection){
		Statement statement =null;
		try {
			statement=connection.createStatement();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return statement;
		
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
