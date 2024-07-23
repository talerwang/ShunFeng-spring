//package com.great.database;
//
//import com.great.pojo.TbOrders;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Properties;
//import java.util.Set;
//
//public class DAOFactory {
//    private static Map<Class, Object> daoMap = new HashMap<>();
//
//    //静态代码块
//    static {
////        daoMap.put(TbUserDAO.class,new TbUserDaoImpl());
////        daoMap.put(TbOrdersDAO.class, new TbOrdersDaoImpl());
//    }
//
//    Properties properties = new Properties();
//    //2.获取配置文件的ID流
//    InputStream is = DAOFactory.class.getClass().getClassLoader().getResourceAsStream("daoconfig.properties");
//
//        try{
//        //3.加载配置文件信息到配置文件对象中
//        properties.load(is);
//        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
//        for (Map.Entry<Object, Object> entry : entries) {
//            String key = (String) entry.getKey();
//            String value = (String) entry.getValue();
//            System.out.println(key + "------" + value);
//            Class cl = Class.forName(key);
//            Object obj = Class.forName(value).newInstance();
//            daoMap.put(cl, obj);
//        }
//    }
//        catch(IOException e)
//    {
//        throw new RuntimeException(e);
//    }
//
//
//
//    public static <T> T getDao(Class c) {
//        {
//            return (T)daoMap.get(c);
//        }
//    }
//
//}