package com.sbrf.reboot;

import com.sbrf.reboot.bank.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(basePackages = "com.sbrf.reboot.bank")
public class Main {
    public static void main(String[] args) {
        getXMLContext();
        getAnnotationConfigContext();
        getJavaBasedAnnotationConfigContext();
    }

    public static void getXMLContext() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        Account account = applicationContext.getBean("account", Account.class);
        account.test();
    }

    public static void getAnnotationConfigContext() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        Account account = applicationContext.getBean("account", Account.class);
        account.test();
    }

    public static void getJavaBasedAnnotationConfigContext(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Account account = applicationContext.getBean(Account.class);
        account.test();
    }
}
