package com.cn.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.ssm.dao.IUserDao;
import com.cn.ssm.model.User;
import com.cn.ssm.service.IUserService;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    //	@Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }

    public int updateUserById(User record) {
        return this.userDao.updateByPrimaryKey(record);
    }

    public int deleteUserById(int id) {
        return this.userDao.deleteByPrimaryKey(id);
    }

    public int addUser(User user) {
        return this.userDao.insert(user);
    }

    public List<User> getAllUser() {
        return this.userDao.selectAll();
    }
}
