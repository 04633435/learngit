package com.example.demo.repository;

import com.example.demo.entity.Parameter;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ParameterRepository {
    @Autowired
 private JdbcTemplate jdbcTemplate;
    public List<Parameter> getAllParameterById(){
        String sql="select * from details ";
        List<Parameter> ParameterList = jdbcTemplate.query(sql,new ParameterRowMapper());
        return ParameterList;
    }
}
class ParameterRowMapper implements RowMapper<Parameter> {
    public Parameter mapRow(ResultSet rs, int i) throws SQLException {
        Parameter parameter= new Parameter();
     //   user.setUname(rs.getString("uname"));
        //  user.setGid(rs.getInt("GID"));
        parameter.setSerialNumber(rs.getInt("serialNumber"));
        parameter.setBillingCategory(rs.getString("billingCategory"));
        parameter.setDeviceName(rs.getString("deviceName"));
        parameter.setQuantity(rs.getString("quantity"));
        parameter.setPurchasePrice(rs.getString("purchasePrice"));
        parameter.setPurchaseDate(rs.getString("purchaseDate"));
        parameter.setBaseRate(rs.getString("baseRate"));
        return parameter;
    }
}
