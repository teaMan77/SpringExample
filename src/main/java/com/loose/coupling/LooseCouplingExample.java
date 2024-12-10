package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {
//        UserDataProvider databaseProvider = new UserDatabaseProvider();
//        UserManager userManagerWithDB = new UserManager(databaseProvider);
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        UserManager userManager = (UserManager) context.getBean("userDataManager");
        System.out.println(userManager.getUserInfo());

//        UserDataProvider webServiceProvider = new WebServiceDataProvider();
//        UserManager userManagerWithWS = new UserManager(webServiceProvider);
        userManager = (UserManager) context.getBean("webDataManager");
        System.out.println(userManager.getUserInfo());

//        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
//        UserManager userManagerWithNewDB = new UserManager(newDatabaseProvider);
        userManager = (UserManager) context.getBean("newDataManager");
        System.out.println(userManager.getUserInfo());
    }
}
