package cn.workshop.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conn {

	/**
	 * ���ݿ�Ĳ�������
	 */
        
        public void con(){
        	Connection con;//
            String driver="com.mysql.jdbc.Driver";
            //�����ҵ����ݿ���qcl
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
                Statement statement = con.createStatement();//����statement�Ķ���
                String sql = "select * from introducemember;";//�ҵ����ݱ��ǡ���
                ResultSet resultSet = statement.executeQuery(sql);
          
                String name1=null;
                while (resultSet.next()) {
                    name1 = resultSet.getString("name");
                    System.out.println("name1��" + name1);
                }
                resultSet.close();
                con.close();
            } catch (ClassNotFoundException e) {
                System.out.println("���ݿ�����û�а�װ");

            } catch (SQLException e) {
                System.out.println("���ݿ�����ʧ��");
            }
  
		
	}
	
	

}
