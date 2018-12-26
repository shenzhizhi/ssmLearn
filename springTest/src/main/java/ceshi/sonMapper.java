package ceshi;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class sonMapper implements RowMapper<son> {

    @Override
    public son mapRow(ResultSet rs, int rowNum) throws SQLException {
        son son=new son();
        son.setName(rs.getString("name"));
        son.setAge(rs.getInt("age"));
        return  son;
    }
}
