package demo;

import com.bean.Users;
import com.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3springaop {

    private Users users;

    public static void main(String[] args) {

        ApplicationContext app=
                new ClassPathXmlApplicationContext("spring.xml");
       UsersService user=(UsersService) app.getBean("ser");
       user.selectall(10,20);
      // user.insert(new Users());
      // user.delete(10);
      // user.update(new Users());
    }
}
