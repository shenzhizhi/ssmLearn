package service;

import entity.Item;

import java.util.List;

public interface ItemService {

    List<Item> getItems(int itemClass);
}
