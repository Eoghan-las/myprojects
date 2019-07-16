package com.im.dao;

import java.util.List;

import com.im.pojo.GameComment;

/**
 * @author Eoghan
 * @category 游戏评论数据访问层
 */
public interface GameCommentDao {

	/**
	 * 根据游戏id查询
	 * @return
	 */
	public List<GameComment> findByGid(int gid);
	
	/**
	 * 根据用户id查询
	 * @return
	 */
	public List<GameComment> findByUid(int uid);
	
	/**
	 * 根据id查询评论对象
	 * @param id
	 * @return
	 */
	public GameComment findByid(int id);
	
	/**
	 * 添加游戏评论
	 * @param gameComment
	 * @return
	 */
	public int add(GameComment gameComment);
	
	
	/**
	 * 删除游戏评论
	 * @param ids
	 * @return
	 */
	public int delete(int[] ids);
	
	
}
