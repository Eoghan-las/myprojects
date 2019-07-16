package com.im.dao;

import java.util.List;

import com.im.pojo.Order;

/**
 * @author wxl
 * @category 购买记录数据访问接口
 */
public interface OrderDao {
	/**
	 * 根据用户id查询购买游戏记录列表
	 * @return
	 */
	public List<Order> findByUid(int uid);
	
	/**
	 * 根据游戏id查询购买游戏记录列表
	 * @return
	 */
	public List<Order> findByGid(int gid);
	
	/**
	 * 添加购买游戏记录
	 * @return
	 */
	public int add(Order order);
	
	/**
	 * 删除购买游戏记录
	 * @return
	 */
	//public int delete();
	
	/**
	 * 根据用户id，和游戏id查询对应购买游戏记录
	 * @return
	 */
	public Order find(int uid,int gid);
	
}
