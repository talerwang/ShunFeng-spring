package com.great.servlet;


import com.great.database.TbOrdersDaoImpl;
import com.great.database.TbUserDaoImpl;
import com.great.pojo.TbUser;
import com.great.service.UserService;
import com.great.util.SpringUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UserService userService = SpringUtil.getSpringUtil().getContext().getBean(UserService.class);

        if (userService.login(username,password) == true) {
            System.out.println("Login success!");
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            if ("on".equals(request.getParameter("remember"))) { // 确保从请求中获取remember参数
                Cookie cookie = new Cookie("username", username);
                cookie.setMaxAge(60 * 60 * 24 * 7);
                response.addCookie(cookie);
            }
            // 请求重定向
            response.sendRedirect("two.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }}

//结果集游标
//            System.out.println(rs.next());
//            System.out.println("id="+rs.getInt(1));
//            System.out.println("username="+rs.getString(2));
//            System.out.println("password="+rs.getString(3));


//        if ("admin".equals(username) &&  "123456".equals(password)){
//            HttpSession session = request.getSession();
//            session.setAttribute("username",username);
//            if ("on".equals("remember"))
//            {
//                Cookie cookie = new Cookie("username",username);
//                cookie.setMaxAge(5*60);
//                response.addCookie(cookie);
//            }
//            //请求重定向
//            response.sendRedirect("two.jsp");
//        }
//        else
//            response.sendRedirect("index.jsp");




