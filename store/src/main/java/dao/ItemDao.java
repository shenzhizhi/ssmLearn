package dao;

import entity.Item;
import entity.ItemClass;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemDao {

    /**
     * 获取该类别下所有商品
     * @return 商品列表
     */
    List<Item> getItems(@Param("itemClass") int itemclassid);

    /**
     * 根据id或者商品名或者2个属性获取商品
     * @param itemID
     * @param itemName
     * @return 商品
     */
    Item getItem (@Param("itemID") Integer itemID,@Param("itemName") String itemName);


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
     * @param itemClassID 商品类型id
     * @param stock 库存
     * @param price 价格
     * @param itemInfo 商品信息
     * @param imagePath 图片路径
     * @return 更新行数
     */
    int updateItem(@Param("itemID") Integer itemID,@Param("itemName") String itemName, @Param("itemClassID") Integer itemClassID, @Param("stock") Integer stock,@Param("price") float price, @Param("itemInfo") String itemInfo,@Param("imagePath") String imagePath );

    /**
     * 删除该商品信息
     * @param item
     * @return 影响行数
     */
    int deleteItem(Item item);

}
