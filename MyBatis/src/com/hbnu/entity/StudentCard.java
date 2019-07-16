package com.hbnu.entity;

public class StudentCard {
	private int scardid;
	private String scardinfo;
	public int getScardid() {
		return scardid;
	}
	public void setScardid(int scardid) {
		this.scardid = scardid;
	}
	public String getScardinfo() {
		return scardinfo;
	}
	public void setScardinfo(String scardinfo) {
		this.scardinfo = scardinfo;
	}
	public StudentCard() {

	}
	public StudentCard(int scardid, String scardinfo) {
		super();
		this.scardid = scardid;
		this.scardinfo = scardinfo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.scardid+",  "+this.scardinfo;
	}
		

}
