package com.im.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.annotation.Resource;

/**
 * @author wxl
 * @category 游戏实体类
 */
public class Game implements Serializable{
	/**
	 * 游戏编号
	 */
	private int gid;

	/**
	 * 游戏名称
	 */
	private String gname;
	/**
	 * 游戏类别编号
	 */
	private int kid;
	/**
	 * 游戏类型对象
	 */
	@Resource
	private Gamekind gameKind;

	public Game(int gid, String gname, int kid, Gamekind gameKind, String content, String url, String gamespace,
			String saler, String videos, float gprice, int comming, Timestamp commingtime) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.kid = kid;
		this.gameKind = gameKind;
		this.content = content;
		this.url = url;
		this.gamespace = gamespace;
		this.saler = saler;
		this.videos = videos;
		this.gprice = gprice;
		this.comming = comming;
		this.commingtime = commingtime;
	}

	/**
	 * 游戏简介
	 */
	private String content;

	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Gamekind getGameKind() {
		return gameKind;
	}

	public void setGameKind(Gamekind gameKind) {
		this.gameKind = gameKind;
	}

	/**
	 * 游戏平台
	 */
	private String gamespace;
	/**
	 * 游戏厂商
	 */
	private String saler;
	/**
	 * 游戏视频
	 */

	private String videos;
	/**
	 * 游戏价格
	 */
	private float gprice;
	/**
	 * 是否上市
	 */
	private int comming;
	/**
	 * 上市时间
	 */
	private Timestamp commingtime;

	public Game() {
		super();
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public int getKid() {
		return kid;
	}

	public void setKid(int kid) {
		this.kid = kid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getGamespace() {
		return gamespace;
	}

	public void setGamespace(String gamespace) {
		this.gamespace = gamespace;
	}

	public String getSaler() {
		return saler;
	}

	public void setSaler(String saler) {
		this.saler = saler;
	}

	public String getVideos() {
		return videos;
	}

	public void setVideos(String videos) {
		this.videos = videos;
	}

	public float getGprice() {
		return gprice;
	}

	public void setGprice(float gprice) {
		this.gprice = gprice;
	}

	public int getComming() {
		return comming;
	}

	public void setComming(int comming) {
		this.comming = comming;
	}

	public Timestamp getCommingtime() {
		return commingtime;
	}

	public void setCommingtime(Timestamp commingtime) {
		this.commingtime = commingtime;
	}

}
