package com.im.service;


import java.sql.Date;
import java.util.List;

import com.im.pojo.User;

/**
 * @author Eoghan
 * @category 用户数据访问层
 */
public interface UserService {
	/**
	 * 查询改时间范围内所有的用户对象信息
	 * @return
	 */
	public List<User> findRageInputtime(Date inputtime1,Date inputtime2);
	/**
	 * 查询所有用户列表
	 */
	public List<User> findAll();
	
	/**
	 * 根据用户名查询用户对象
	 * @return
	 */
	public User findByName(String name);
	
	/**
	 * 根据用户id查询用户对象
	 * @param uid
	 * @return
	 */
	public User findById(int uid);
	
	/**
	 * 根据用户名密码查询用户对象
	 * @return
	 */
	public User findByNamePass(String name,String pass);
	
	/**
	 * 根据用户角色(客户，媒体，管理员)查询用户列表
	 */
	public List<User> findByRole(int uloa);
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public boolean insert(User user);
	
	
	/**
	 * 删除
	 * @param uid
	 * @return
	 */
	public boolean delete(int[] uid);
	
	/**
	 * 修改（更新）
	 * @param user
	 * @return
	 */
	public boolean update(User user);
	

}
