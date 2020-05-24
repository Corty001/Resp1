package service.user;

import dao.user.UserMapper;
import pojo.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserMapper userMapper;
    @Override
    public List<User> findUsersWithConditions(User user) {
        try {
            return userMapper.getUserList(user);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public boolean addNewUser(User user) {
            boolean result = false;
            try {
                if (userMapper.add(user) == 1)
                    result = true;
                // int i = 1 / 0;
            } catch (RuntimeException e) {
                e.printStackTrace();
                throw e;
            }
            return result;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
