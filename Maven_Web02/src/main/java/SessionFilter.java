import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter("/*")
public class SessionFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //参数类型强制转化
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //第一访问服务器每天有session
        HttpSession session = request.getSession(false);
        //首页路径
        String loginURI = request.getContextPath()+"/index.jsp";
        //登录表单提交路径
        String loginServletURI = request.getContextPath()+"/LoginServlet";
        //注册表单提交路径
        String registerURI = request.getContextPath()+"/RegisterServlet";
        //服务器工程名称路径
        String requestURI = request.getRequestURI();

//        System.out.println(" loginURI"+loginURI);
//        System.out.println(" loginServletURI"+loginServletURI);
//        System.out.println(" requestURI"+requestURI);
        //已经登陆过有session并且session里有username这个值
        boolean loginin = (session != null && session.getAttribute("username")!=null);
        //判断客户端请求是否是访问首页 或者 是不是准备做登录表单
        boolean loginRequest = request.getRequestURI().equals(loginURI) || request.getRequestURI().equals(loginServletURI) || request.getRequestURI().equals(registerURI);
        //已经登陆过有session并且session里有username这个值
        boolean isResourceFile = request.getRequestURI().matches(".*\\.(css|js|jpg|jpeg|png|gif|ico|txt|pdf|doc|docx|eot|ttf|woff|svg)$");



//        System.out.println(" loginin"+loginin);
//        System.out.println(" loginRequest"+loginRequest);
//        已经登录过||做准备
        if (loginin||loginRequest||isResourceFile){
//            System.out.println(" 执行到放行");
            filterChain.doFilter(request,response);
        }
        else {
            Cookie[]cookies= request.getCookies();
            if (cookies!=null)
            {
                for (Cookie cookie:cookies)
                {
                    if (cookie.getName().equals("username"))
                    {

                        session = request.getSession(true);
                        session.setAttribute("username",cookie.getValue());
                        session.setMaxInactiveInterval(2*60);
                        filterChain.doFilter(request,response);
                        return;
                    }
                }
            }




            // //不放行重定向
            response.sendRedirect(loginURI);
        }
    }
    @Override
    public void destroy() {

    }
}
