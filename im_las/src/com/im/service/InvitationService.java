package com.im.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.im.pojo.Invitation;

/**
 * @author Eoghan
 * @category 帖子业务逻辑层
 */
@Service
public interface InvitationService {

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
	public boolean insert(Invitation invitation);
	
	/**
	 * 批量删除帖子
	 * @param ids
	 * @return
	 */
	public boolean delete(int[] ids);
	
	/**
	 * 更新帖子
	 * @param invitation
	 * @return
	 */
	public boolean update(Invitation invitation);
	
	/**
	 * 模糊查询
	 * @return
	 */
	public List<Invitation> search(String text);
}
