package com.im.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;

/**
 * @author wxl
 *@category 游戏评论实体类
 */
public class Comment implements Serializable{
	/**
	 * 资讯编号
	 */
	private int zid;
	/**
	 * 用户编号
	 */
	private int uid;
	/**
	 * 评论内容
	 */
	private String content;
	/**
	 * 评论发表时间
	 */
	private Timestamp inputdate;
	
	@Resource
	private User user;
	
	@Resource
	private Message message;
	
	
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Comment() {
		super();
	}
	
	
	public Comment(@Param("zid") int zid,@Param("uid") int uid,@Param("content") String content, Timestamp inputdate) {
		super();
		this.zid = zid;
		this.uid = uid;
		this.content = content;
		this.inputdate = inputdate;
		
	}

	public int getZid() {
		return zid;
	}
	public void setZid(int zid) {
		this.zid = zid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getInputdate() {
		return inputdate;
	}
	public void setInputdate(Timestamp inputdate) {
		this.inputdate = inputdate;
	}
	
}
