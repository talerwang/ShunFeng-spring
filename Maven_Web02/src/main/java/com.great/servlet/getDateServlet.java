package com.great.servlet;

import com.google.gson.Gson;
import com.great.javabean.Admin;
import com.great.javabean.Role;
import com.great.service.OrderService;
import com.sun.org.apache.xpath.internal.operations.Or;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "getDateServlet", value = "/getDateServlet")
public class getDateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        //先准备role对象
//        Role role1 = new Role(1, LocalDateTime.parse("2024-07-12T15:19:10"),
//                LocalDateTime.parse("2024-07-12T15:19:10"), 1, "管理员");
//        Role role2 = new Role(2, LocalDateTime.parse("2024-07-12T15:19:10"),
//                LocalDateTime.parse("2024-07-12T15:19:10"), 1, "票务员");
//        Role role3 = new Role(3, LocalDateTime.parse("2024-07-12T15:19:10"),
//                LocalDateTime.parse("2024-07-12T15:19:10"), 1, "运维人员");
//
//        //准备ArrayList 存放多个admin对象
//        List<Admin> admins = new ArrayList<Admin>();
//        //创建admin，role对象作为admin对象成员，添加到arraylist保存
//        admins.add(new Admin(1, "admin", LocalDateTime.parse("2024-07-12T15:19:10"),
//                LocalDateTime.parse("2024-07-12T15:19:10"), 1,1,  role1));
//        admins.add(new Admin(1, "john", LocalDateTime.parse("2024-07-12T15:19:10"),
//                LocalDateTime.parse("2024-07-12T15:19:10"), 1, 2, role2));
//        admins.add(new Admin(1, "jenny", LocalDateTime.parse("2024-07-12T15:19:10"),
//                LocalDateTime.parse("2024-07-12T15:19:10"), 1, 3, role3));

        //javabean对象 转 json数据格式




//        Gson g = new Gson();
//        String jsonStr = g.toJson();
//        System.out.println(jsonStr);
//
//        response.getWriter().write(jsonStr);
    }
//



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        System.out.println("123123");
        int limit = Integer.parseInt(request.getParameter("limit"));
        int offset = Integer.parseInt(request.getParameter("offset"));

        System.out.println("dopost 查询几条limit = "+ limit);
        System.out.println("dopost 从哪个下标开始 = "+ offset);

        OrderService os = new OrderService();

        String JSONstr = os.showData(limit,offset);


        response.getWriter().write(JSONstr);

    }
}
