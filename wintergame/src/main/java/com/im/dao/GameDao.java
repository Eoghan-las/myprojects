package com.im.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.im.pojo.Game;

/**
 * @author Eoghan
 * @category 游戏数据访问层
 */

public interface GameDao {
	
	/**
	 * 查询所有游戏列表
	 * @return
	 */
	public List<Game> findAll();
	
	
	/**
	 * 根据游戏类型查询游戏列表
	 * @param kid
	 * @return
	 */
	public List<Game> findByKid(int kid);
	
	/**
	 * 根据游戏id查询游戏对象
	 * @param gid
	 * @return
	 */
	public Game findById(int gid);
	
	/**
	 * 上传新游戏
	 * @return
	 */
	public int addGame(Game game);
	
	/**
	 * 删除游戏
	 * @param ids
	 * @return
	 */
	public int delete(int[] ids);
	
	/**
	 * 修改游戏信息
	 * @return
	 */
	public int update(Game game);
	
	/**
	 * 根据游戏id数组查询游戏列表
	 * @param ids
	 * @return
	 */
	public List<Game> finByIds(int[] ids); 
	/**
	 * 分页查询游戏列表
	 * @param ids
	 * @return
	 */
	public List<Game> findprt(@Param("nid") int nid); 
	
	
	/**
	 * 模糊查询
	 * @param gname
	 * @return
	 */
	public List<Game> search(@Param("gname") String gname); 
	
	/**
	 * 按照类型模糊查询
	 * @param gname
	 * @return
	 */
	public List<Game> searchBykid(@Param("gname") String gname,@Param("kid")int kid); 
	
	/**
	 * 修改游戏资源路径
	 * @param game
	 * @return
	 */
	public int updateUrl(Game game);
}
