package com.zytc.jdbc;


import com.zytc.common.GlobalConstants;
import java.sql.*;

/**
 * Created by Administrator on 2018/4/18.
 */

public class JdbcManager {


    /**
     * 创建数据库连接对象
     */
    public static Connection getConnection() {
        Connection conn = null;
//        Configuration conf = new Configuration();
//    获取mysql连接驱动类
        String driver = GlobalConstants.JDBC_DRIVER;
//    mysql连接地址
        String url = GlobalConstants.JDBC_URL;
        String userName = GlobalConstants.JDBC_USER;
        String password = GlobalConstants.JDBC_PASSWORD;

//    注册驱动类
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("找不到驱动！");
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection(url, userName, password);
            if (conn != null) {
                System.out.println("connection successful");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("connection fail");
            e.printStackTrace();
        }
        return conn;
    }


//    public static void main(String[] args) {
//
//        new JdbcManager().getConnection();
//    }


}