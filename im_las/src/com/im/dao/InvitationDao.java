package com.im.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.im.pojo.Invitation;

/**
 * @author Eoghan
 * @category 帖子数据访问层
 */
@Repository
public interface InvitationDao {

	/**
	 * 查询所有帖子集合
	 * @return
	 */
	public List<Invitation> find();
	
	/**
	 * 根据帖子编号查询帖子信息
	 * @param id
	 * @return
	 */
	public Invitation findById(int id);
	
	/**
	 * 发帖
	 * @param invitation
	 * @return
	 */
	public int insert(Invitation invitation);
	
	/**
	 * 批量删除帖子
	 * @param ids
	 * @return
	 */
	public int delete(int[] ids);
	
	/**
	 * 更新帖子
	 * @param invitation
	 * @return
	 */
	public int update(Invitation invitation);
	
	/**
	 * 模糊查询
	 * @return
	 */
	public List<Invitation> search(@Param("text") String text);
}
