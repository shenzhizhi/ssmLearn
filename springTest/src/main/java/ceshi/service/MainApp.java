package ceshi.service;


import ceshi.dao.Dao;
import ceshi.son;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


public class MainApp {

    private final static Logger logger=Logger.getLogger(MainApp.class.getClass());

    public static void main(String[] args) {

    logger.error("error!!!");

    ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
    MainServiceImpl impl =(MainServiceImpl) context.getBean("mainServiceImpl");
    son son=impl.select("qiuwei");
    System.out.println(son.toString());



//       DaoImpl daoimpl  =(DaoImpl) context.getBean("daoimpl");
////       daoimpl.add("qiuwei",24);
//        System.out.println(daoimpl.select("qiuwei",24).toString());
    }
}
