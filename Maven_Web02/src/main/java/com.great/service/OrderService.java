package com.great.service;
import com.google.gson.Gson;

//import com.great.database.DAOFactory;
import com.great.database.TbOrdersDAO;
import com.great.database.TbOrdersDaoImpl;
import com.great.javabean.OrderPagenation;
import com.great.pojo.TbOrders;
import com.great.util.SpringUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class OrderService {
    private TbOrdersDAO orderImpl ;
    public void setOrderImpl(TbOrdersDaoImpl orderImpl){this.orderImpl = orderImpl;}
    public String showData(int limit,int offset){
        String JsonStr = null;
        //Json字符串的封装类JAVABEEN包含总数据个数 表格显示订单list
        OrderPagenation op = new OrderPagenation();
        //从数据库先查询到总数据个数给类的count变量赋值
        op.setCount(orderImpl.GetCount());
        //从数据库先查询到订单list数给类的OrderList变量赋值
        op.setOrderList(orderImpl.queryALLOrders(limit,offset));

        Gson gson = new Gson();
        JsonStr =  gson.toJson(op);

        return  JsonStr;

    }

}