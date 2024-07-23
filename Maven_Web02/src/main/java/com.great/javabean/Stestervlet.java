package com.great.javabean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Stestervlet", value ="/Stestervlet")
public class Stestervlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Stestervlet DOGET");
        //获取URL
        String URL = request.getRequestURL()+"";
        System.out.println("URL:"+URL);
        //获取URI
        String URI = request.getRequestURI()+"";
        System.out.println("URI:"+URI);
        //获取浏览器请求参数字符串QueryStr
        String QueryStr = request.getQueryString();
        System.out.println("QueryStr:"+QueryStr);
        //获取浏览器提交方式Method
        String Method = request.getMethod();
        System.out.println("Method:"+Method);
        //获取浏览器提交协议protocol
        String protocol = request.getProtocol();
        System.out.println("protocol:"+protocol);
        //服务器上下对象 = 》 服务器工程路径
        String contextPath = request.getContextPath();
        System.out.println("获取客户端浏览器 上下文对象"+contextPath);
        //根据特定的参数名来获取请求参数
        String username = request.getParameter("username");
        System.out.println("根据特定的参数名来获取请求参数"+username);

        String []arr = request.getParameterValues("arr");
        if(arr!=null && arr.length>0)
        {
            for (String str:arr){
                System.out.println("str=" + str);
            }
        }
    }
}



