package com.im.service;

import java.util.List;

import com.im.pojo.Game;

/**
 * @author Administrator
 * @category 游戏业务逻辑接口
 */
public interface GameService {
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
	public boolean addGame(Game game);
	
	/**
	 * 删除游戏
	 * @param ids
	 * @return
	 */
	public boolean delete(int[] ids);
	
	/**
	 * 修改游戏信息
	 * @return
	 */
	public boolean update(Game game);
	
	/**
	 * 根据游戏id数组查询游戏列表
	 * @param ids
	 * @return
	 */
	public List<Game> finByIds(int[] ids); 
	/**
	 * 模糊查询
	 * @param gname
	 * @return
	 */
	public List<Game> search(String gname);
	
	/**
	 * 按照类型模糊查询
	 * @param gname
	 * @return
	 */
	public List<Game> searchBykid(String gname,int kid);
	/**
	 * 分页查询游戏列表
	 * @param ids
	 * @return
	 */
	public List<Game> findprt(int nid); 
 }
