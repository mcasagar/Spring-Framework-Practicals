package com.sb.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	private Integer cno;
	private String cname;
	private String addrs;
	private Float principleAmount;
	private Float rate;
	private Integer time;
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
	public Float getPrincipleAmount() {
		return principleAmount;
	}
	public void setPrincipleAmount(Float principleAmount) {
		this.principleAmount = principleAmount;
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
