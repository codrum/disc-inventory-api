package com.fargendo.discinventory.model.mapper;


import com.fargendo.discinventory.model.Status;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class StatusMapper implements RowMapper<Status> {
    @Override
    public Status mapRow(ResultSet rs, int rowNum) throws SQLException {
        //return Status.builder().id(rs.getInt("status_id")).description(rs.getString("description")).build();
        return new Status(rs.getInt("status_id"),rs.getString("description"));
    }


}
