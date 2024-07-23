package com.great.service;

//import com.great.database.DAOFactory;
import com.great.database.TbOrdersDAO;
import com.great.database.TbOrdersDaoImpl;
import com.great.database.TbUserDAO;
import com.great.database.TbUserDaoImpl;
import com.great.pojo.TbUser;
import com.great.util.SpringUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserService {
    private TbUserDAO userImpl ;
    public void setUserImpl(TbUserDaoImpl userImpl){this.userImpl = userImpl;}

    private TbUser user = null;
    public boolean login(String username,String password)
    {
        user = userImpl.queryUserByNameAndPass(username,password);
        if (user!=null && user.getPassword().equals(password)){
            return true;
        }

        boolean flag = false;
        return flag;
    }
    public  boolean register(String username,String password,String repetPass){
        boolean flag = false;
        if (password.equals(repetPass)){

            if(userImpl.queryUserByName (username) == true) {
                TbUser user = new TbUser();
                user.setUsername(username);
                user.setPassword(password);

                if (userImpl.insertUser(user) == true) {
                    flag = true;

                }
            }else{
                System.out.println("账号已存在");
            }

        } else{
            System.out.println("密码不一致");
        }

        return flag;
    }
}