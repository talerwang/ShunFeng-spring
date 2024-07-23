package com.great.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static  final String JDBC_URL = "jdbc:mysql://localhost:3306/demodb";
    private static  final String JDBC_USER="demouser";
    private static  final String JDBC_PASSWORD="12345678";
    private static volatile  DBUtil instance = null;


    //构造函数 注册数据库驱动
    private  DBUtil() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("注册数据库驱动");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    //单例设计模式，获取当前的数据库连接工具类
    public static DBUtil getInstance() {
        if (instance == null)
        {
            synchronized (DBUtil.class){
                if(instance==null){
                    instance=new DBUtil();
                    System.out.println("创建工具类");
                }
            }
        }
        return instance;
    }
    public Connection getconnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            System.out.println("获取数据库连接");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
    //关闭数据库连接
    public void CloseConnection(Connection conn)
    {
        if (conn!=null)
        {
            try {
                conn.close();
                System.out.println("关闭连接");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
