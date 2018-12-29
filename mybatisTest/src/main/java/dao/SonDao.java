package dao;

import entity.Son;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SonDao {
    @Insert("insert into son (name,age) values(#{name},#{age})")
    void insert(Son son);

    @Select("select * from son where name=#{aaa} ")
    Son select( @Param("aaa") String name);
}


