package com.example.enity;

import java.io.Serializable;

public class TencentEnity implements  Serializable {
   
	
	 private String positionname;
	 private String positionlink;
	 private String positionType;
	 private String peopleNum;
	 private String workLocation;
	 private String publishTime;
	public String getPositionname() {
		return positionname;
	}
	public void setPositionname(String positionname) {
		this.positionname = positionname;
	}
	public String getPositionlink() {
		return positionlink;
	}
	public void setPositionlink(String positionlink) {
		this.positionlink = positionlink;
	}
	public String getPositionType() {
		return positionType;
	}
	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}
	public String getPeopleNum() {
		return peopleNum;
	}
	public void setPeopleNum(String peopleNum) {
		this.peopleNum = peopleNum;
	}
	public String getWorkLocation() {
		return workLocation;
	}
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	@Override
	public String toString() {
		return "TencentEnity [positionname=" + positionname + ", positionlink=" + positionlink + ", positionType="
				+ positionType + ", peopleNum=" + peopleNum + ", workLocation=" + workLocation + ", publishTime="
				+ publishTime + "]";
	}
	 
	 
}
