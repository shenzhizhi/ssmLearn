import dao.ItemDao;
import entity.Item;
import entity.ItemClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import service.impl.ItemServiceImpl;

import java.util.List;

//@ContextConfiguration("application.xml")
public class DaoTest {

//    private ItemServiceImpl impl;
//
//    @Autowired
//    public void setImpl(ItemServiceImpl impl) {
//        this.impl = impl;
//    }
    ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
    ItemServiceImpl impl=(ItemServiceImpl) context.getBean("itemServiceImpl");

    @Test
    public void ceshiget(){


        List<Item> list=impl.getItems(1);
        for(Item e : list){
            System.out.println(e.toString());
        }
    }

    @Test
    public void ceshiAdd(){

        Item item1=new Item("牛肉",1,30,28.0f,"我是牛肉","");
        impl.addItem(item1);


    }

}
