package dao;

import entity.ItemClass;

public interface ItemClassDao {

    /**
     * 根据id获取种类
     * @param classID 种类id
     * @return 种类
     */
    ItemClass getItemClass(int classID);

    /**
     * 设置商品种类
     * @param itemClass 种类
     * @return 影响行数
     */
    int setItemClass(ItemClass itemClass);
}
