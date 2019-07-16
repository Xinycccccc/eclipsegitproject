package com.hbnu.entity;

//定义学生Bean-没定义好
public class Student {
	private int sno;
	private String sname;
	private int sage;
	private String saddress;
	private StudentCard studendcard;
	public StudentCard getStudendcard() {
		return studendcard;
	}
	public void setStudendcard(StudentCard studendcard) {
		this.studendcard = studendcard;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public Student() {
	}
	public Student(int sno, String sname, int sage, String saddress) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sage = sage;
		this.saddress = saddress;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+this.sno+",  "+this.sname+",  "+this.sage+",  "+this.saddress+",  "+this.studendcard+"]";
	}

}
