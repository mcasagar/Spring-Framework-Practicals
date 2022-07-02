package com.sb.beans;
//Spring bean class
public class Costomer {
	//cno, cname, billAmt are mandatory properties
	private int cno;
	private String cname;
	private float billAmt;
	//cadds, mobileNo are optional properties
	private String cadds;
	private long mobileNo;
	
	//Constructor
	public Costomer(int cno, String cname, float billAmt) {
		System.out.println("Costomer :: 3-param constructor");
		this.cno = cno;
		this.cname = cname;
		this.billAmt = billAmt;
	}

	public void setCadds(String cadds) {
		this.cadds = cadds;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Costomer [cno=" + cno + ", cname=" + cname + ", billAmt=" + billAmt + ", cadds=" + cadds + ", mobileNo="
				+ mobileNo + "]";
	}
	
	
	
	
	
}
