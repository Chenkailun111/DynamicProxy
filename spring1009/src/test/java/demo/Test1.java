package demo;

import com.dao.UsersDao;
import com.dao.impl.JdkDaili;
import com.dao.impl.UsersDaoImpl;

public class Test1 {
    public static void main(String[] args) {
        UsersDao dao=new UsersDaoImpl();
       // dao.selectall();
        //创建代理对象
        JdkDaili daili=new JdkDaili(dao);
        UsersDao dao2= daili.createproxy();//dao2是dao的代理对象
        dao2.delete(1);
    }
}
