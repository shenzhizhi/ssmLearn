package ceshi;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class DaoImpl implements Dao{

    private DataSource dataSource;
    private JdbcTemplate template;


    public void setDataSource(DataSource dataSource){
        this.dataSource=dataSource;
        this.template=new JdbcTemplate(dataSource);
    }


    public void add(String name,int age) {
        String sql="insert into son (name,age) values(?,?)";
        template.update(sql,name,age);

    }


    public son select(String name,int age) {
        String sql="select * from son where name=? and age=?";
        son son=template.queryForObject(sql,new Object[]{name,age},new sonMapper());
        return son;
    }
}
