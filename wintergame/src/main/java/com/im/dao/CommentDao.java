package com.im.dao;

import java.util.List;

import com.im.pojo.Comment;

/**
 * @author Eoghan
 * @category 资讯评论数据访问层
 */
public interface CommentDao {

	/**
	 * 添加资讯评论
	 * @param comment
	 * @return
	 */
	public int add(Comment comment);
	
	/**
	 * 删除资讯评论
	 * @param ids
	 * @return
	 */
	public int delete(int[] ids);
	
	/**
	 * 根据资讯id查询资讯评论列表
	 * @param zid
	 * @return
	 */
	public List<Comment> findByZid(int zid);

	/**
	 * 根据用户id查询资讯评论列表
	 * @param iid
	 * @return
	 */
	public List<Comment> findByUid(int uid);
}
