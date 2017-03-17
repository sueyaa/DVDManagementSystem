package com.oaec.dvd.model;

public class User {
	private int id;//用户编号
	private String uname;
	private String upass;
	private int type;//0 - 普通用户，1 - 管理员
	
	public User() {
		super();
	}

	public User(String uname, String upass, int type) {
		super();
		this.uname = uname;
		this.upass = upass;
		this.type = type;
	}

	public User(int id, String uname, String upass, int type) {
		super();
		this.id = id;
		this.uname = uname;
		this.upass = upass;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null || obj.getClass() != this.getClass()){
			return false;
		}
		
		User u = (User)obj;
		if(this.getUname().equals(u.getUname())){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public String toString() {
		return "用户信息 ： id=" + id + ", uname=" + uname + ", upass=" + upass + ", type=" + type;
	}
	
}
