package com.im.pojo;

import java.io.Serializable;

/**
 * @author wxl
 *@category 游戏类型实体类
 */
public class Gamekind implements Serializable{
	/**
	 * 游戏类型编号
	 */
	private int kid;
	/**
	 * 游戏类型名称
	 */
	private String kname;
	public Gamekind() {
		super();
	}
	public Gamekind(int kid, String kname) {
		super();
		this.kid = kid;
		this.kname = kname;
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	
}
