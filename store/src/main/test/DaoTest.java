import dao.ItemDao;
import entity.Item;
import entity.ItemClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.impl.ItemClassServiceImpl;
import service.impl.ItemServiceImpl;

import java.util.List;


public class DaoTest {

    private ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
    private ItemServiceImpl impl=(ItemServiceImpl) context.getBean("itemServiceImpl");
    private ItemClassServiceImpl itemClassServiceImpl=(ItemClassServiceImpl)context.getBean("itemClassServiceImpl");
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

    @Test
    public void ceshigetItem(){
        Item item11=impl.getItem(1,"猪肉");
        System.out.println(item11.toString());
    }

    @Test
    public void ceshiupdate(){
        System.out.println(impl.updateItem(1,null,1,12,10.0f,"我是修改的猪肉","asd"));
    }

    @Test
    public void ceshidelete(){
        System.out.println(impl.deleteItem(6));
    }

    @Test
    public void ceshigetItemClassName(){
        System.out.println(itemClassServiceImpl.getItemClassName(1));
    }
}
