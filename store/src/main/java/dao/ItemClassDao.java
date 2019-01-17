package dao;

import entity.ItemClass;
import org.apache.ibatis.annotations.Param;

public interface ItemClassDao {

    /**
     * 根据id获取种类
     * @param classID 种类id
     * @return 种类
     */
    String getItemClass(@Param("classID") int classID);


}
