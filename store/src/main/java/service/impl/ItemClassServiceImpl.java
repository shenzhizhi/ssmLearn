package service.impl;

import dao.ItemClassDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ItemClassService;

@Service
public class ItemClassServiceImpl implements ItemClassService{

    private ItemClassDao itemClassDao;

    @Autowired
    public void setItemClassDao(ItemClassDao itemClassDao) {
        this.itemClassDao = itemClassDao;
    }

    @Override
    public String getItemClassName(int itemID){
        return itemClassDao.getItemClass(itemID);
    }
}
