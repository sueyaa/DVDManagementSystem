package com.oaec.dvd.model;

public class DVD {
	private int id;
	private String dname;
	private int dcount;//�������
	private int status;//0 -�ѽ���� 1 - �ɽ�
	
	public DVD(int id, String dname, int dcount, int status) {
		super();
		this.id = id;
		this.dname = dname;
		this.dcount = dcount;
		this.status = status;
	}

	public DVD(String dname, int dcount, int status) {
		super();
		this.dname = dname;
		this.dcount = dcount;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getDcount() {
		return dcount;
	}

	public void setDcount(int dcount) {
		this.dcount = dcount;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null || obj.getClass() != this.getClass()){
			return false;
		}
		
		DVD d = (DVD)obj;
		if(this.getDname().equals(d.getDname())){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "DVD��Ϣ : id=" + id + ", dname=" + dname + ", dcount=" + dcount + ", status=" + status;
	}

}
