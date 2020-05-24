package service.user;

import pojo.User;

import java.util.List;

public interface UserService {
    public List<User> findUsersWithConditions(User user);

    public boolean addNewUser(User user);
}
