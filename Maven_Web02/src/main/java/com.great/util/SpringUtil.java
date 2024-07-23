package com.great.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil
   {
        private static SpringUtil springUtil;
        private ApplicationContext  context;

        SpringUtil(){
            context = new ClassPathXmlApplicationContext("beans.xml");
        }
        public static SpringUtil getSpringUtil(){
            if (springUtil == null){
                springUtil = new SpringUtil();

            }
            return springUtil;
        }

        public ApplicationContext getContext(){
            return context;
        }


}