package com.great.database;

import com.great.pojo.OrderView;
import com.great.pojo.TbOrders;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class TbOrdersDaoImpl implements TbOrdersDAO {

    @Override
    public int Get_count_num() {
        int count_num = 0;
        try {
            Connection conn = DBUtil.getInstance().getconnection();
            PreparedStatement pstmt = conn.prepareStatement("SELECT COUNT(*) FROM tb_orders");
            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                count_num = resultSet.getInt(1);
            }
            DBUtil.getInstance().CloseConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count_num;
    }

    @Override
    public TbOrders queryOrderByID(String order_id) {
        TbOrders order = null;
        try {
            Connection conn = DBUtil.getInstance().getconnection();
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM tb_orders WHERE order_id = ?");
            pstmt.setString(1, order_id);
            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                order = new TbOrders();
                order.setOrdersId(resultSet.getLong("orders_id"));
                order.setUserId(resultSet.getLong("user_id"));
                order.setSengAddressId(resultSet.getLong("seng_address_id"));
                order.setReciverAddressId(resultSet.getLong("reciver_address_id"));
                order.setOrderDate(resultSet.getString("order_date"));
                order.setOrderStatus(resultSet.getString("order_status"));
                order.setOrderPrice(resultSet.getDouble("order_price"));
            }
            DBUtil.getInstance().CloseConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return order;
    }

    @Override
    public List<TbOrders> GetAllOrders() {
        List<TbOrders> orders = new ArrayList<>();
        try {
            Connection conn = DBUtil.getInstance().getconnection();
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM tb_orders");
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                TbOrders order = new TbOrders();
                order.setOrdersId(resultSet.getLong("order_id"));
                order.setUserId(resultSet.getLong("user_id"));
                order.setSengAddressId(resultSet.getLong("seng_address_id"));
                order.setReciverAddressId(resultSet.getLong("reciver_address_id"));
                order.setOrderDate(resultSet.getString("order_date"));
                order.setOrderStatus(resultSet.getString("order_status"));
                order.setOrderPrice(resultSet.getDouble("order_price"));
                orders.add(order);
            }
            DBUtil.getInstance().CloseConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;
    }

    @Override
    public int GetCount() {
        int count = 0;
        try {
            DBUtil dbUtil = DBUtil.getInstance();
            Connection conn = dbUtil.getconnection();
            PreparedStatement psmt = null;
            ResultSet resultSet = null;

            if (conn != null) {
                String querySql = "select * from order_view";
                psmt = conn.prepareStatement(querySql);

                resultSet = psmt.executeQuery();

                while (resultSet.next()) {
                    count++;
                }
                dbUtil.CloseConnection(conn);
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return count;
    }




    @Override
    public List<OrderView> queryALLOrders(int limit , int offset) {
        List<OrderView> orderList= new ArrayList<>();
        try
        {
            DBUtil dbUtil = DBUtil.getInstance();
            Connection conn = dbUtil.getconnection();
            ResultSet resultSet = null;
            PreparedStatement pstmt = null;


            String querySql = ("SELECT * FROM order_view LIMIT ? OFFSET ?");

                pstmt = conn.prepareStatement(querySql);

                pstmt.setInt(1,limit);
                pstmt.setInt(2,offset);
                resultSet=pstmt.executeQuery();
            System.out.println("123456");
            if (resultSet!=null) {
                while(resultSet.next()){
                    OrderView ov = new OrderView();
                    ov.setOrderId(resultSet.getInt("order_id"));
                    ov.setOrderDate(resultSet.getString("order_date"));
                    ov.setTotalPrice(resultSet.getInt("total_price"));
                    ov.setSendCity(resultSet.getString("send_city"));
                    ov.setUserPhone(resultSet.getString("user_phone"));
                    ov.setUsername(resultSet.getString("username"));
                    ov.setSendAddressLine1(resultSet.getString("send_address_line1"));
                    ov.setSendAddressLine2(resultSet.getString("send_address_line2"));
                    ov.setReciverCity(resultSet.getString("reciver_city"));
                    ov.setReciverAddressLine1(resultSet.getString("reciver_address_line1"));
                    ov.setReciverAddressLine2(resultSet.getString("reciver_address_line2"));
                    orderList.add(ov);
                }
            }


        }
            catch (SQLException e) {
            throw new RuntimeException(e);
        }
            return  orderList;

    }}