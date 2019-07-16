package com.im.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Resource;

/**
 * @author wxl
 *@category 游戏收藏实体类
 */
public class Collect implements Serializable{
	/**
	 * 评论发表时间
	 */
	private int uid;
	
	/**
	 * 用户对象
	 */
	@Resource
	private User user;
	/**
	 * 游戏编号
	 */
	private int gid;
	
	/**
	 * 游戏对象
	 */
	@Resource
	private Game game;
	
	/**
	 * 收藏时间
	 */
	private Timestamp inputtime;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Collect() {
		super();
	}
	public Collect(int uid, int gid, Timestamp inputtime) {
		super();
		this.uid = uid;
		this.gid = gid;
		this.inputtime = inputtime;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public Timestamp getInputtime() {
		return inputtime;
	}
	public void setInputtime(Timestamp inputtime) {
		this.inputtime = inputtime;
	}
	
}
