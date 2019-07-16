package com.im.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Resource;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

/**
 * @author WXL
 *@category 咨询实体类
 */
@Component
public class Message implements Serializable{
	/**
	 * 咨讯编号
	 */
	private int zid;
	/**
	 * 资讯标题
	 */
	private String ztitle;
	/**
	 * 资讯内容
	 */
	private String zcontent;
	/**
	 * 用户编号
	 */
	private int uid;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * 用户对象
	 */
	@Resource 
	private User user;
	/**
	 * 相关游戏
	 */
	private String games;
	/**
	 * 资讯发表时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp  messagetime;
	public Message() {
		super();
	}
	public Message(int zid, String ztitle, String zcontent, int uid, String games, Timestamp messagetime) {
		super();
		this.zid = zid;
		this.ztitle = ztitle;
		this.zcontent = zcontent;
		this.uid = uid;
		this.games = games;
		this.messagetime = messagetime;
	}
	public int getZid() {
		return zid;
	}
	public void setZid(int zid) {
		this.zid = zid;
	}
	public String getZtitle() {
		return ztitle;
	}
	public void setZtitle(String ztitle) {
		this.ztitle = ztitle;
	}
	public String getZcontent() {
		return zcontent;
	}
	public void setZcontent(String zcontent) {
		this.zcontent = zcontent;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getGames() {
		return games;
	}
	public void setGames(String games) {
		this.games = games;
	}
	public Timestamp getMessagetime() {
		return messagetime;
	}
	public void setMessagetime(Timestamp messagetime) {
		this.messagetime = messagetime;
	}
	
	
}
