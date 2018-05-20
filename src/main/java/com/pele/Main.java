package com.pele;

import com.pele.action.UserAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: pele
 * @time: 2018/5/20 13:28
 * @project: spring
 * @description:
 */
public class Main {
    public static void  main(String[] args){
        //解析beans.xml文件，创建一个容器，该容器会自动组装xml配置的那些bean
        ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
        //通过id获取对应的bean
        UserAction userAction = (UserAction) apc.getBean("userAction");
        //调用UserAction的login方法
        userAction.login();
    }
}
