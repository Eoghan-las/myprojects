package com.im.dao;

import java.util.List;

import com.im.pojo.Gamekind;

/**
 * @author Eoghan
 * @category 游戏类型数据访问层
 */
public interface GameKindDao {

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
	public int add(Gamekind gamekind);
	
	
	/**
	 * 删除类型
	 * @param kids
	 * @return
	 */
	public int delete(int[] kids);
	
}
