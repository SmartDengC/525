package cn.workshop.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conn {

	/**
	 * 数据库的测试连接
	 */
        
        public void con(){
        	Connection con;//
            String driver="com.mysql.jdbc.Driver";
            //这里我的数据库是qcl
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
                Statement statement = con.createStatement();//创建statement的对象
                String sql = "select * from introducemember;";//我的数据表是》》
                ResultSet resultSet = statement.executeQuery(sql);
          
                String name1=null;
                while (resultSet.next()) {
                    name1 = resultSet.getString("name");
                    System.out.println("name1：" + name1);
                }
                resultSet.close();
                con.close();
            } catch (ClassNotFoundException e) {
                System.out.println("数据库驱动没有安装");

            } catch (SQLException e) {
                System.out.println("数据库连接失败");
            }
  
		
	}
	
	

}
