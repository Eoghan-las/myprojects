package com.im.service;

import java.util.List;

import com.im.pojo.Order;

/**
 * @author wxl
 * @category  购买记录业务逻辑接口
 */
public interface OrderService {
	/**
	 * 根据用户id查询已购游戏列表
	 * @return
	 */
	public List<Order> findByUid(int uid);
	
	/**
	 * 根据游戏id查询购买游戏记录列表
	 * @return
	 */
	public List<Order> findByGid(int gid);
	
	/**
	 * 购买游戏
	 * @return
	 */
	public boolean add(Order Order);
	
	/**
	 * 删除已购游戏
	 * @return
	 */
	//public int delete();
	
	/**
	 * 根据用户id，和游戏id查询对应记录
	 * @return
	 */
	public Order find(int uid,int gid);

}
