package service.impl;

import dao.ItemDao;
import entity.Item;
import entity.ItemClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ItemService;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {


    private ItemDao itemDao;

    @Autowired
    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    @Override
    public List<Item> getItems(int itemclassid) {
        return itemDao.getItems(itemclassid);
    }

    @Override
    public Item getItem(int itemID, String itemName) {
        return itemDao.getItem(itemID,itemName);
    }

    @Override
    public int addItem(Item item) {
        return itemDao.addItem(item);
    }

    @Override
    public int updateItem(int itemID, String itemName, int itemClassID, int stock, float price, String itemInfo, String imagePath) {
        return itemDao.updateItem(itemID,itemName,itemClassID,stock,price,itemInfo,imagePath);
    }

    @Override
    public int deleteItem(int itemid) {
        return itemDao.deleteItem(itemid);
    }
}
