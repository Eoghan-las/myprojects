package com.im.service;

import java.util.List;

import com.im.pojo.Comment;

/**
 * @author Administrator
 *@category 资讯业务逻辑接口
 */
public interface CommentService {
	
	/**
	 * 添加资讯评论
	 * @param comment
	 * @return
	 */
	public boolean add(Comment comment);
	
	/**
	 * 删除资讯评论
	 * @param ids
	 * @return
	 */
	public boolean delete(int[] ids);
	
	/**
	 * 根据资讯id查询资讯评论列表
	 * @param zid
	 * @return
	 */
	public List<Comment> findByZid(int zid);
	/**
	 * 根据用户id查询资讯评论列表
	 * @param uid
	 * @return
	 */
	public List<Comment> findByUid(int zid);

}
