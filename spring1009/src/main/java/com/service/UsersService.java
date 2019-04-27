package com.service;

import com.bean.Users;

import java.util.List;

public interface UsersService {
    public List<Users> selectall(int pageindex, int pagesize);
    public int  insert(Users users);
    public int delete(int id);
    public int update(Users users);
}
