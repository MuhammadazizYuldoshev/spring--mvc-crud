package uz.pdp.springmvccrud.dao;

import uz.pdp.springmvccrud.model.User;

import java.util.List;

public interface UserDao {

    public void saveUser(User user);

    public void updateUser(User user);

    public void delete(int id);

    public User getUser(int id);

    public List<User> getAllUsers();


}
