package com.fargendo.discinventory.model.mapper;


import com.fargendo.discinventory.model.Disc;
import com.fargendo.discinventory.model.Status;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class DiscMapper implements RowMapper<Disc> {
    @Override
    public Disc mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Disc.builder()
                .id(rs.getInt("disc_id"))
                .brandId(rs.getInt("brand_id"))
                .mold(rs.getString("mold"))
                .typeId(rs.getInt("type_id"))
                .plastic(rs.getString("plastic"))
                .weight(rs.getInt("weight"))
                .color(rs.getString("color"))
                .stampColor(rs.getString("stamp_color"))
                .price(rs.getDouble("price"))
                .title(rs.getString("title"))
                .description(rs.getString("description"))
                .imageUrl(rs.getString("image_url"))
                .flatness(rs.getInt("flatness"))
                .stiffness(rs.getInt("stiffness"))
                .used(rs.getInt("used") != 0)
                .statusId(rs.getInt("status_id"))
                .build();
    }


}
