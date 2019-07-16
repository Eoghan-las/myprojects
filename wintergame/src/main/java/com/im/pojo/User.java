package com.im.pojo;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

/**
 * @author Eoghan
 * @category 用户实体类
 */
@Component
public class User implements Serializable{

	private int uid;
	private String uname;
	private String upass;
	
	private Date ubirthday;
	private String uemail;
	private int utel;
	private int uloa;
	private String ufriend;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp inputtime;
	
	
	public User(int uid, String uname, String upass, Date ubirthday, String uemail, int utel, int uloa, String ufriend,
			Timestamp inputtime) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upass = upass;
		this.ubirthday = ubirthday;
		this.uemail = uemail;
		this.utel = utel;
		this.uloa = uloa;
		this.ufriend = ufriend;
		this.inputtime = inputtime;
	}
	public int getUloa() {
		return uloa;
	}
	public void setUloa(int uloa) {
		this.uloa = uloa;
	}
	public int getUtel() {
		return utel;
	}
	public void setUtel(int utel) {
		this.utel = utel;
	}
	public Date getUbirthday() {
		return ubirthday;
	}
	public void setUbirthday(Date ubirthday) {
		this.ubirthday = ubirthday;
	}
	public User() {
		super();
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUfriend() {
		return ufriend;
	}
	public void setUfriend(String ufriend) {
		this.ufriend = ufriend;
	}
	public Timestamp getInputtime() {
		return inputtime;
	}
	public void setInputtime(Timestamp inputtime) {
		this.inputtime = inputtime;
	}
	
	
}
