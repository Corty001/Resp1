package dao.user;

import pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> getUserList(User user);

    public int add(User user);

}