package cn.workshop.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class text1 {

	public static void main(String[] args) {
		Connection con;//
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/525gzs";
        String user="root";
        String password="123456";
        ResultSetMetaData m=null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
           
            if (!con.isClosed()) {
                System.out.println("yes");
            }
            Statement statement = con.createStatement();
            String sql = "select * from introducemember;";
            ResultSet resultSet = statement.executeQuery(sql);
            m=resultSet.getMetaData();
            int columns=m.getColumnCount();
            for(int i=1;i<=columns;i++)
            {
            System.out.println(i+" \n");
             System.out.print(m.getColumnName(i));
             System.out.print("\t\t");
            }
            System.out.println();
            
            while(resultSet.next())
            {
             for(int i=1;i<=columns;i++)
             {
              System.out.print(resultSet.getString(i));
              //System.out.print("\t\t");
             }
             System.out.println();
            }
            
            
            
//            String name1=null;
//            while (resultSet.next()) {
//                name1 = resultSet.getString("name");
//                System.out.println("name1£º" + name1);
//            }
            
            
            resultSet.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("no");

        } catch (SQLException e) {
            System.out.println("no2");
        }
	}

}
