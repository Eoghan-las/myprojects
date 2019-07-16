package com.im.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.im.pojo.Comment;
import com.im.pojo.Message;

/**
 * @author wxl
 *@category 咨询数据访问接口
 */
public interface MessageDao {
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
	public List<Message> findByUid(int uid);
	/**
	 * 添加咨讯
	 * @param message
	 * @return
	 */
	public  int insert(Message message);
	/**
	 * 更新咨询(本人提交的游戏咨询)
	 * @param id
	 * @return
	 */
	public int update(Message message);
	/**
	 * 删除往期咨询
	 * @param zids 咨询编号数组
	 * @return 
	 */
	public int delete (int[] zids);
	/**
	 * 删除往期咨询
	 * @param zid 咨询编号
	 * @return 
	 */
	public int deleteByZid (int zid);
	/**
	 * 根据咨询标题、内容模糊查询
	 * @param ztitle
	 * @return
	 */
	public List<Message> search(@Param("ztitle") String ztitle,@Param("uid")int uid);
	
	/**
	 * 根据游戏查询相关资讯(模糊查询)
	 * @param uid
	 * @return
	 */
	public List<Message> findByGame(@Param("gid") String gid);
}
