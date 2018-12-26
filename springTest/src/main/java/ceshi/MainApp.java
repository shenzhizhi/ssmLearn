package ceshi;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
    public static void main(String[] args) {

    ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");

       DaoImpl daoimpl  =(DaoImpl) context.getBean("daoimpl");
//       daoimpl.add("qiuwei",24);
        System.out.println(daoimpl.select("qiuwei",24).toString());
    }
}
