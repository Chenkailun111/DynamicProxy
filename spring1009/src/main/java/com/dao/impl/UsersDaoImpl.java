package com.dao.impl;

import com.bean.Users;
import com.dao.UsersDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsersDaoImpl implements UsersDao {
    public List<Users> selectall(int pageindex, int pagesize) {
        System.out.println("selectall-dao");
        return null;
    }

    public int insert(Users users) {
        System.out.println("insert-dao");
        return 0;
    }

    public int delete(int id) {
        System.out.println("delete-dao");
        return 0;
    }

    public int update(Users users) {
        System.out.println("update-dao");
        return 0;
    }

    public void selectall() {
        System.out.println("usersDao被执行");
    }
}
