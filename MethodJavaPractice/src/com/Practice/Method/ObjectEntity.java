package com.Practice.Method;

import java.time.LocalDate;
public class ObjectEntity {
	
	Integer netDays =0;
	LocalDate basicDate = LocalDate.of(2017, 2, 14);
	LocalDate netDueDate =LocalDate.of(2017, 1, 11);
	@Override
	public String toString() {
		return "ObjectEntity [netDays=" + netDays + ", basicDate=" + basicDate + ", netDueDate=" + netDueDate + "]";
	}
	public Integer getNetDays() {
		return netDays;
	}
	public void setNetDays(Integer netDays) {
		this.netDays = netDays;
	}
	public LocalDate getBasicDate() {
		return basicDate;
	}
	public void setBasicDate(LocalDate basicDate) {
		this.basicDate = basicDate;
	}
	public LocalDate getNetDueDate() {
		return netDueDate;
	}
	public void setNetDueDate(LocalDate netDueDate) {
		this.netDueDate = netDueDate;
	}

}
