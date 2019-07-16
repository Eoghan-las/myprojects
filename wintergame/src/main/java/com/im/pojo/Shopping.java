package com.im.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Resource;

/**
 * @author wxl
 *@category 购买实体类
 */
public class Shopping implements Serializable{
	/**
	 * 用户编号
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
	
	@Resource
	private Game game;
	/**
	 * 购买时间
	 */
	private Timestamp time;
	public Shopping() {
		super();
	}
	public Shopping(int uid, int gid, Timestamp time) {
		super();
		this.uid = uid;
		this.gid = gid;
		this.time = time;
	}
	public int getUid() {
		return uid;
	}
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
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
}
