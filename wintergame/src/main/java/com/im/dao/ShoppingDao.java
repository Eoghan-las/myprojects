package com.im.dao;

import java.util.List;

import com.im.pojo.Shopping;

/**
 * @author Eoghan
 * @category 已购游戏数据访问层
 */
public interface ShoppingDao {
	
	
	/**
	 * 根据用户id查询已购游戏列表
	 * @return
	 */
	public List<Shopping> findByUid(int uid);
	
	/**
	 * 购买游戏
	 * @return
	 */
	public int add(Shopping shopping);
	
	/**
	 * 删除已购游戏
	 * @return
	 */
	//public int delete();
	
	/**
	 * 根据用户id，和游戏id查询对应记录
	 * @return
	 */
	public Shopping find(int uid,int gid);
	
}
