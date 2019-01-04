import dao.ItemDao;
import entity.Item;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import service.impl.ItemServiceImpl;

import java.util.List;

@ContextConfiguration("application.xml")
public class DaoTest {

    private ItemServiceImpl impl;

    @Autowired
    public void setImpl(ItemServiceImpl impl) {
        this.impl = impl;
    }

    @Test
    public void ceshi(){

        List<Item> list=impl.getItems(1);
        for(Item e : list){
            System.out.println(e.toString());
        }
    }
}
