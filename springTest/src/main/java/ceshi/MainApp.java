package ceshi;


import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
    private final static Logger logger=Logger.getLogger(MainApp.class.getClass());
    public static void main(String[] args) {
    logger.error("error!!!");
    ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");

       DaoImpl daoimpl  =(DaoImpl) context.getBean("daoimpl");
//       daoimpl.add("qiuwei",24);
        System.out.println(daoimpl.select("qiuwei",24).toString());
    }
}
