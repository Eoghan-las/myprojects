package com.im.service;

import java.util.List;

import com.im.pojo.GameComment;

/**
 * @author Administrator
 *@category 游戏评论业务逻辑接口
 */
public interface GameCommentService {
	
	/**
	 * 根据游戏id查询
	 * @return
	 */
	public List<GameComment> findByGid(int gid);
	
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
	public boolean add(GameComment gameComment);
	
	
	/**
	 * 删除游戏评论
	 * @param ids
	 * @return
	 */
	public boolean delete(int[] ids);
}
