package com.ctgu.proname.service;

import java.util.List;

import com.ctgu.proname.entity.User;

public interface UserService {
	int addUser(User user);

	List<User> findUserBySome(User user);
	
	List<User> findAllUser();

	User findUserByUsername(String username);

	User findUserByStudentid(String studentid);
	
	int updateUser(User user);
}
