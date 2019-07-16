package com.im.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Resource;

/**
 * @author wxl
 * @category 游戏评论实体类
 */
public class GameComment implements Serializable{
	/**
	 * 游戏编号
	 */
	private int gid;
	/**
	 * 用户编号
	 */
	private int uid;
	
	@Resource
	private User user;
	
	@Resource
	private Game game;
	
	/**
	 * 游戏评价
	 */
	private int gorb;
	/**
	 * 游戏评论内容
	 */
	private String content;
	/**
	 * 游戏评论发表时间
	 */
	private Timestamp inputdate;
	
	
	public Timestamp getInputdate() {
		return inputdate;
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
	public void setInputdate(Timestamp inputdate) {
		this.inputdate = inputdate;
	}
	public GameComment() {
		super();
	}
	public GameComment(int gid, int uid, int gorb, String content, Timestamp inputdate) {
		super();
		this.gid = gid;
		this.uid = uid;
		this.gorb = gorb;
		this.content = content;
		this.inputdate = inputdate;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getGorb() {
		return gorb;
	}
	public void setGorb(int gorb) {
		this.gorb = gorb;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
