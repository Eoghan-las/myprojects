package com.im.service;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.dao.UserDao;
import com.im.pojo.User;
/**
 * 
 * @author wxl
 * @category 用户业务逻辑实现类
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;
	@Override
	public List<User> findAll() {
		
		return userDao.findAll();
	}

	@Override
	public User findByName(String name) {
		
		return userDao.findByName(name);
	}

	@Override
	public User findById(int uid) {
		
		return userDao.findById(uid);
	}

	@Override
	public User findByNamePass( String uname, String upass) {
		
		return userDao.findByNamePass(uname, upass);
	}

	@Override
	public List<User> findByRole(int uloa) {
		
		return userDao.findByRole(uloa);
	}

	@Override
	public boolean insert(User user) {
		
		return userDao.insert(user)>0?true:false;
	}

	@Override
	public boolean delete(int[] uid) {
		
		return userDao.delete(uid)>0?true:false;
	}

	@Override
	public boolean update(User user) {
		
		return userDao.update(user)>0?true:false;
	}

	@Override
	public List<User> findRageInputtime(Date inputtime1, Date inputtime2) {
		new Timestamp(inputtime1.getTime());
		new Timestamp(inputtime2.getTime());
		return userDao.findRageInputtime(inputtime1, inputtime2);
		
	}

	



	
	

}
