package com.im.service;

import java.util.List;

import com.im.pojo.Collect;

/**
 * @author Administrator
 * @category 游戏收藏 业务逻辑接口
 *
 */
public interface CollectService {
	/**
	 * 添加新收藏
	 * @return
	 */
	public boolean add(Collect collect);
	
	
	/**
	 * 批量删除
	 * @return
	 */
	public boolean delete(int[] ids);
	
	/**
	 * 根据用户id和游戏id查询收藏游戏对象
	 * @param uid
	 * @param gid
	 * @return
	 */
	public Collect findById(int uid,int gid);
	/**
	 * 根据用户id查询收藏游戏对象
	 * @param uid
	 * @param gid
	 * @return
	 */
	public List<Collect> findById(int uid);

}
