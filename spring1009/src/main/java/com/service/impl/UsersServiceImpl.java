package com.service.impl;

import com.bean.Users;
import com.dao.UsersDao;
import com.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ser")
public class UsersServiceImpl implements UsersService {

    @Autowired
   private  UsersDao dao;

    public void setDao(UsersDao dao) {
        this.dao = dao;
    }

    public List<Users> selectall(int pageindex, int pagesize) {
        System.out.println("selectall--service");
        dao.selectall(pageindex,pagesize);
        return null;
    }

    public int insert(Users users) {
        System.out.println("insert--service");
        dao.insert(users);
        return 0;
    }

    public int delete(int id) {
        System.out.println("delete--service");
        dao.delete(id);
        return 0;
    }

    public int update(Users users) {
        System.out.println("update--service");
        dao.update(users);
        return 0;

    }
}
