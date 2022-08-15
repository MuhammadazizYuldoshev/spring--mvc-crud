package uz.pdp.springmvccrud.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import uz.pdp.springmvccrud.model.User;

import javax.sql.DataSource;
import java.util.List;
@Service
public class UserDaoImpl implements UserDao{

    private JdbcTemplate jdbcTemplate;

    public UserDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public void saveUser(User user) {
            //add user
            String sql = "insert into users (name,surname) values (?,?)";

            jdbcTemplate.update(sql,user.getName(),user.getSurname());

    }

    @Override
    public void updateUser(User user) {
        //update user
        String sql = "update users set name=?,surname=? where id=?";

        jdbcTemplate.update(sql,user.getName(),user.getSurname(),user.getId());
    }


    @Override
    public void delete(int id) {
        String sql = "delete from users where id=?";
        jdbcTemplate.update(sql,id);

    }

    @Override
    public User getUser(int id) {
        String sql = "select * from users where id="+id;
        return jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(User.class));
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "select * from users";
        return  jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(User.class));

    }
}
