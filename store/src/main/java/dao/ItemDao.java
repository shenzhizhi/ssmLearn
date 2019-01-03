package dao;

import entity.Item;
import entity.ItemClass;

import java.util.List;

public interface ItemDao {

    /**
     * 获取该类别下所有商品
     * @param ClassID
     * @return 商品列表
     */
    List<Item> getItems(int ClassID);

    /**
     * 根据id或者商品名或者2个属性获取商品
     * @param itemID
     * @param itemName
     * @return 商品
     */
    Item getItem (int itemID,String itemName);


    /**
     * 新增item
     * @param item
     * @return  影响行数
     */
    int  addItem(Item item);

    /**
     * 更新商品，id必须传，其他参数可以不传，定制sql
     * 根据传参进行插入条件
     *
     * @param itemID 商品id
     * @param itemName 商品名
     * @param itemClass 商品类型
     * @param stock 库存
     * @param price 价格
     * @param itemInfo 商品信息
     * @param imagePAth 图片路径
     * @return 更新行数
     */
    int updateItem(int itemID,String itemName, ItemClass itemClass, int stock, float price, String itemInfo, String imagePAth );

    /**
     * 删除该商品信息
     * @param item
     * @return 影响行数
     */
    int deleteItem(Item item);

}
