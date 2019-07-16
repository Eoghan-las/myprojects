package com.im.service;

import java.util.List;

import com.im.pojo.Gamekind;

/**
 * @author wxl
 * @category  游戏类型业务逻辑接口
 */
public interface GameKindService {
	/**
	 * 查询所有游戏类型
	 * @return
	 */
	public List<Gamekind> findAll();
	
	/**
	 * 根据类型id查询类型对象
	 * @param kid
	 * @return
	 */
	public Gamekind findById(int kid);
	
	/**
	 * 添加游戏类型
	 * @param gamekind
	 * @return
	 */
	public boolean add(Gamekind gamekind);
	
	
	/**
	 * 删除类型
	 * @param kids
	 * @return
	 */
	public boolean  delete(int[] kids);
}
