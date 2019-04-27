package demo;

import com.bean.Users;
import com.bean.UsersProxy;

public class Test2 {
    public static void main(String[] args) {
        Users u=new Users();//实际对象
        u.setName("aaa"); //代理还没有创建不会运行代理方法
        Users u2=new UsersProxy(u).createUsersProxy();//被代理对象
        u2.setName("bbbb");
    }
}
