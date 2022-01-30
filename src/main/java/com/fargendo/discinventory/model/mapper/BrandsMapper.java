package com.fargendo.discinventory.model.mapper;


import com.fargendo.discinventory.model.Brands;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class BrandsMapper implements RowMapper<Brands> {
    @Override
    public Brands mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Brands(rs.getInt("brand_id"),rs.getString("name"),rs.getString("description"));
    }
}
