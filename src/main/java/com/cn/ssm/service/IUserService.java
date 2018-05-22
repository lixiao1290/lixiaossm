package com.cn.ssm.service;

import com.cn.ssm.model.User;

import java.util.List;

public interface IUserService {
	  User getUserById(int userId);
	  int updateUserById(User user);
	  int addUser(User user);
	  int deleteUserById(int id);
	  List<User> getAllUser();
}
