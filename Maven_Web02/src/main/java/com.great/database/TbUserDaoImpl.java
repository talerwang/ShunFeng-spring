package com.great.database;

import com.great.pojo.TbUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TbUserDaoImpl implements com.great.database.TbUserDAO {
    @Override
    public int getCount() {
        System.out.println("执行jdbc代码，获取记录数");
        return 0;
    }

    @Override
    public TbUser queryUserByNameAndPass(String name, String pass) {
        TbUser user = null;
        try {
            com.great.database.DBUtil dbUtil = com.great.database.DBUtil.getInstance();
            ResultSet resultSet = null;
            Connection conn = dbUtil.getconnection();
            PreparedStatement pstmt = null;

            if (conn != null) {
                String querySql = "select* from tb_user where username=? and password=?";
                pstmt = conn.prepareStatement(querySql);
                pstmt.setString(1, name);
                pstmt.setString(2, pass);

                resultSet = pstmt.executeQuery();


                if (resultSet.next()) {
                    user = new TbUser();
                    user.setUserId(resultSet.getInt("user_id"));
                    user.setUsername(resultSet.getString("username"));
                    user.setPassword(resultSet.getString("password"));
                    user.setEmail(resultSet.getString("email"));
                    user.setPhone(resultSet.getString("phone"));
                    user.setUserStatus(resultSet.getInt("user_status"));
                } else {
                    System.out.println("查无数据");
                }
            }
            dbUtil.CloseConnection(conn);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return user;
    }
    @Override
    public List<TbUser> queryAllUsers(int limit, int offset) {
        List<TbUser> userlist = new ArrayList<TbUser>();
        try {
            com.great.database.DBUtil dbUtil = com.great.database.DBUtil.getInstance();
            ResultSet resultSet = null;
            Connection conn = dbUtil.getconnection();


            if(conn!=null){
                String querySql= "select* from tb_user limit ? offset ?";
                PreparedStatement pstmt = conn.prepareStatement(querySql);
                pstmt.setInt(1,limit);
                pstmt.setInt(2,offset);

                resultSet = pstmt.executeQuery();

                if(resultSet != null)
                {
                    while(resultSet.next())
                    {
                        TbUser user = new TbUser();
                        user.setUserId(resultSet.getInt("user_id"));
                        user.setUsername(resultSet.getString("username"));
                        user.setPassword(resultSet.getString("password"));
                        user.setEmail(resultSet.getString("email"));
                        user.setPhone(resultSet.getString("phone"));
                        user.setUserStatus(resultSet.getInt("user_status"));

                        userlist.add(user);
                    }
                }
                else{
                    System.out.println("查询无结果");
                }


            }
            dbUtil.CloseConnection(conn);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return userlist;
    }

    @Override
    public boolean insertUser(TbUser user) {

        try {
            com.great.database.DBUtil dbUtil = com.great.database.DBUtil.getInstance();
            Connection conn = dbUtil.getconnection();
            int result = 0;


            if(conn!=null){
                String querySql= "INSERT INTO  tb_user(username , password ) VALUES (?,?) ";
                PreparedStatement pstmt = conn.prepareStatement(querySql);

                pstmt.setString(1,user.getUsername());
                pstmt.setString(2,user.getPassword());

                result = pstmt.executeUpdate();

                if(result > 0)
                {
                    System.out.println("插入成功");
                    return true;

                }
                else{
                    System.out.println("插入失败");
                }


            }
            dbUtil.CloseConnection(conn);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return false;
    }

    @Override
    public boolean queryUserByName(String name) {

        try {
            com.great.database.DBUtil dbUtil = com.great.database.DBUtil.getInstance();
            ResultSet resultSet = null;
            Connection conn = dbUtil.getconnection();


            if (conn != null) {
                String querySql = "select* from tb_user where username=? ";

                PreparedStatement pstmt = conn.prepareStatement(querySql);
                pstmt.setString(1, name);

                resultSet = pstmt.executeQuery();

                if (resultSet!=null )
                {
//                    System.out.println("test");
                    //如果注册的时候通过账号做条件查询能查到东西说明 查帐号数据库中已存在
                    //账号数据库已存在 该账号不能注册
                    if (resultSet.next())
                    {
//                        System.out.println("test2");
                        return false;
                    }
                    else {
//                        System.out.println("test3");
                        return true;
                    }
                }

            }
            dbUtil.CloseConnection(conn);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false ;


    }


}