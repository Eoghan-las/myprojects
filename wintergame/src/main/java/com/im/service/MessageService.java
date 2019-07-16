package com.im.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.im.pojo.Message;

/**
 * @author wxl
 * @category  咨询业务逻辑接口
 */
public interface MessageService {
	/**
	 * 查询所有咨询
	 * @return
	 */
	public List<Message> findAll();
	/**
	 * 根据咨询编号查询咨询
	 * @param zid
	 * @return
	 */
	public Message findById(int zid);
	/**
	 * 根据咨询编号查询咨询
	 * @param uid
	 * @return
	 */
	public List<Message> findByUid(@Param("uid") int uid);
	/**
	 * 添加游戏
	 * @param message
	 * @return
	 */
	
	public  boolean insert(Message message);
	/**
	 * 更新咨询(本人提交的游戏咨询)
	 * @param id
	 * @return
	 */
	public boolean update(Message message);
	/**
	 * 删除往期咨询
	 * @param zids 咨询编号数组
	 * @return 
	 */
	public boolean delete (int[] zids);
	/**
	 * 删除往期咨询
	 * @param zid 咨询编号
	 * @return 
	 */
	public boolean deleteByZid (int zid);
	/**
	 * 根据咨询标题模糊查询
	 * @param ztitle
	 * @return
	 */
	public List<Message> search(@Param("ztitle") String ztitle,int uid);
	
	/**
	 * 根据游戏查询相关资讯(模糊查询)
	 * @param uid
	 * @return
	 */
	public List<Message> findByGame(String gid);
}
