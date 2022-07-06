package com.sb.bo;

public class CustomerBO {
	private Integer cno; // optional for insert case
	private String cname;
	private String addrs;
	private Float principalAmount;
	private Float rate;
	private Integer time;
	private Float simpleInterestAmount;
	
	public Float getPrincipalAmount() {
		return principalAmount;
	}
	public void setPrincipalAmount(Float principalAmount) {
		this.principalAmount = principalAmount;
	}	
	public Float getSimpleInterestAmount() {
		return simpleInterestAmount;
	}
	public void setSimpleInterestAmount(Float simpleInterestAmount) {
		this.simpleInterestAmount = simpleInterestAmount;
	}
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	
	
}
