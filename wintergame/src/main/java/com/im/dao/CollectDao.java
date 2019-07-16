package com.im.dao;

import java.util.List;

import com.im.pojo.Collect;

/**
 * @author Eoghan
 * @category 游戏收藏夹数据访问层
 */
public interface CollectDao {

	/**
	 * 添加新收藏
	 * @return
	 */
	public int add(Collect collect);
	
	
	/**
	 * 批量删除
	 * @return
	 */
	public int delete(int[] ids);
	
	/**
	 * 根据用户id和游戏id查询收藏游戏对象
	 * @param uid
	 * @param gid
	 * @return
	 */
	public Collect findById(int uid,int gid);
	
	/**
	 * 根据用户id查看收藏游戏列表
	 * @param uid
	 * @return
	 */
	public List<Collect> findByUid(int uid);
	
}
