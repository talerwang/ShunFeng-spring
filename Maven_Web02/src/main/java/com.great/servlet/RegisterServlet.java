package com.great.servlet;

import com.great.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username_reg = request.getParameter("username_reg");
        String password_reg = request.getParameter("password_reg");
        String password_repet = request.getParameter("password_repet");

        System.out.println(username_reg);
        System.out.println(password_reg);
        System.out.println(password_repet);

        UserService userService = new UserService();
        boolean res = userService.register(username_reg,password_reg,password_repet);

        if (res == true)
        {
            response.getWriter().write("success");
        }
        else{
            response.getWriter().write("error");
        }

    }
}