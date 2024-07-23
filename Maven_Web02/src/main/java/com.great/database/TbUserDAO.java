package com.great.database;

import com.great.pojo.TbUser;

import java.util.List;

public interface TbUserDAO {

    public  int getCount();

    public TbUser queryUserByNameAndPass(String name,String pass);

    public List<TbUser> queryAllUsers(int limit, int offset);

    public boolean insertUser(TbUser user);

    public boolean queryUserByName(String name);
}
