package com.im.dao;

import java.sql.Date;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.im.pojo.User;

/**
 * @author Eoghan
 * @category 用户业务逻辑接口
 */
public interface UserDao {
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
	public User findByNamePass(@Param("uname") String uname,@Param("upass") String upass);
	
	/**
	 * 根据用户角色(客户，媒体，管理员)查询用户列表
	 */
	public List<User> findByRole(int uloa);
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public int insert(User user);
	
	
	/**
	 * 删除
	 * @param uid
	 * @return
	 */
	public int delete(int[] uid);
	
	/**
	 * 修改（更新）
	 * @param user
	 * @return
	 */
	public int update(User user);
	
	
	
}
