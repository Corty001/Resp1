import dao.user.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;
import service.user.UserService;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTest {
    private Logger logger = Logger.getLogger(UserTest.class);

    @Test
    public void user() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-config.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        List<User> userList = new ArrayList<User>();
        User userCondition = new User();
        userCondition.setUserName("赵");
        userCondition.setUserRole(3);
        userList = userService.findUsersWithConditions(userCondition);

        for(User user: userList){
            logger.debug("查询结果: 用户代码:"
                    + user.getUserCode()+" and 用户姓名:"
                    + user.getUserName()+" and 用户角色:"
                    + user.getUserRole()+" and address: "
                    + user.getAddress());
        }
    }

    @Test
    public void testAddNewUser() throws ParseException, ParseException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-config.xml");
        UserService userService = (UserService) ctx.getBean("userService");

        User user = new User();
        user.setUserCode("test112");
        user.setUserName("测试用户101");
        user.setUserPassword("1234567");
        Date birthday =new SimpleDateFormat("yyyy-MM-dd").parse("1984-12-12");
        user.setBirthday(birthday);
        user.setCreationDate(new Date());
        user.setAddress("地址测试");
        user.setGender(1);
        user.setPhone("13688783697");
        user.setUserRole(1);
        user.setCreatedBy(1);
        user.setCreationDate(new Date());

        boolean result = userService.addNewUser(user);

        logger.debug("添加用户测试 : " + result);
    }
}
