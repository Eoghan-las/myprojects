package com.im.service;

import java.util.List;

import com.im.pojo.Shopping;

/**
 * 
 * @author wxl
 * @category 购买游戏业务逻辑接口
 */
public interface ShoppingService {

	/**
	 * 根据用户id查询已购游戏列表
	 * @return
	 */
	public List<Shopping> findByUid(int uid);
	
	/**
	 * 购买游戏
	 * @return
	 */
	public boolean add(Shopping shopping);
	
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
