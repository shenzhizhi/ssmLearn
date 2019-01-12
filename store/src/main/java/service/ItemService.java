package service;

import entity.Item;
import entity.ItemClass;

import java.util.List;

public interface ItemService {



    List<Item> getItems(int itemclassid);

    Item getItem(int itemID, String itemName);

    int addItem(Item item);

    int updateItem(int itemID,String itemName,int itemClassID,int stock,int price,String itemInfo,String imagePath);

    int deleteItem(Item item);
}
