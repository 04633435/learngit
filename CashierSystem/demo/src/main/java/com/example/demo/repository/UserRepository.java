package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User getUserByLoginAndPassword(String uname, String password){
        String sql="select * from users where uname = ? and password = ?";
        System.out.println("sql: " + sql);
        List<User> userList = jdbcTemplate.query(sql, new UserRowMapper(), uname, password);
       return userList.size() == 0 ? null : userList.get(0);



    }
}
class UserRowMapper implements RowMapper<User> {
    public User mapRow(ResultSet rs, int i) throws SQLException {
        User user = new User();
      //  user.setGid(rs.getInt("GID"));
        user.setUname(rs.getString("uname"));
        user.setPassword(rs.getString("password"));
        System.out.println("用户名："+user.getUname());
        return user;
    }
}


