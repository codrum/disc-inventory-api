package com.fargendo.discinventory.model.mapper;


import com.fargendo.discinventory.model.DiscTypes;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class DiscTypesMapper implements RowMapper<DiscTypes> {
    @Override
    public DiscTypes mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new DiscTypes(rs.getInt("disc_type_id"),rs.getString("name"));
    }

}
