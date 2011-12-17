package com.hitachi.hibernate.entities;

import com.hitachi.objects.ParseElement;

// Generated Dec 16, 2011 4:39:12 AM by Hibernate Tools 3.4.0.CR1

/**
 * Replicationinfo generated by hbm2java
 */
public class Replicationinfo implements java.io.Serializable {

	private String objectId;
	private int copyTrackSize;
	private String displayPvolDevNum;
	private String displaySvolDevNum;
	private String fenceLevel;
	private int muNumber;
	private String pvolArrayType;
	private int pvolDevNum;
	private String pvolObjectId;
	private int pvolPoolId;
	private int pvolSerialNumber;
	private int remotePathGroupId;
	private String replicationFunction;
	private int splitTime;
	private int status;
	private String svolArrayType;
	private int svolDevNum;
	private String svolObjectId;
	private int svolPoolId;
	private int svolSerialNumber;

	public Replicationinfo() {
	}

	public Replicationinfo(String objectId, int copyTrackSize,
			String displayPvolDevNum, String displaySvolDevNum,
			String fenceLevel, int muNumber, String pvolArrayType,
			int pvolDevNum, String pvolObjectId, int pvolPoolId,
			int pvolSerialNumber, int remotePathGroupId,
			String replicationFunction, int splitTime, int status,
			String svolArrayType, int svolDevNum, String svolObjectId,
			int svolPoolId, int svolSerialNumber) {
		this.objectId = objectId;
		this.copyTrackSize = copyTrackSize;
		this.displayPvolDevNum = displayPvolDevNum;
		this.displaySvolDevNum = displaySvolDevNum;
		this.fenceLevel = fenceLevel;
		this.muNumber = muNumber;
		this.pvolArrayType = pvolArrayType;
		this.pvolDevNum = pvolDevNum;
		this.pvolObjectId = pvolObjectId;
		this.pvolPoolId = pvolPoolId;
		this.pvolSerialNumber = pvolSerialNumber;
		this.remotePathGroupId = remotePathGroupId;
		this.replicationFunction = replicationFunction;
		this.splitTime = splitTime;
		this.status = status;
		this.svolArrayType = svolArrayType;
		this.svolDevNum = svolDevNum;
		this.svolObjectId = svolObjectId;
		this.svolPoolId = svolPoolId;
		this.svolSerialNumber = svolSerialNumber;
	}

	public String getObjectId() {
		return this.objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public int getCopyTrackSize() {
		return this.copyTrackSize;
	}

	public void setCopyTrackSize(int copyTrackSize) {
		this.copyTrackSize = copyTrackSize;
	}

	public String getDisplayPvolDevNum() {
		return this.displayPvolDevNum;
	}

	public void setDisplayPvolDevNum(String displayPvolDevNum) {
		this.displayPvolDevNum = displayPvolDevNum;
	}

	public String getDisplaySvolDevNum() {
		return this.displaySvolDevNum;
	}

	public void setDisplaySvolDevNum(String displaySvolDevNum) {
		this.displaySvolDevNum = displaySvolDevNum;
	}

	public String getFenceLevel() {
		return this.fenceLevel;
	}

	public void setFenceLevel(String fenceLevel) {
		this.fenceLevel = fenceLevel;
	}

	public int getMuNumber() {
		return this.muNumber;
	}

	public void setMuNumber(int muNumber) {
		this.muNumber = muNumber;
	}

	public String getPvolArrayType() {
		return this.pvolArrayType;
	}

	public void setPvolArrayType(String pvolArrayType) {
		this.pvolArrayType = pvolArrayType;
	}

	public int getPvolDevNum() {
		return this.pvolDevNum;
	}

	public void setPvolDevNum(int pvolDevNum) {
		this.pvolDevNum = pvolDevNum;
	}

	public String getPvolObjectId() {
		return this.pvolObjectId;
	}

	public void setPvolObjectId(String pvolObjectId) {
		this.pvolObjectId = pvolObjectId;
	}

	public int getPvolPoolId() {
		return this.pvolPoolId;
	}

	public void setPvolPoolId(int pvolPoolId) {
		this.pvolPoolId = pvolPoolId;
	}

	public int getPvolSerialNumber() {
		return this.pvolSerialNumber;
	}

	public void setPvolSerialNumber(int pvolSerialNumber) {
		this.pvolSerialNumber = pvolSerialNumber;
	}

	public int getRemotePathGroupId() {
		return this.remotePathGroupId;
	}

	public void setRemotePathGroupId(int remotePathGroupId) {
		this.remotePathGroupId = remotePathGroupId;
	}

	public String getReplicationFunction() {
		return this.replicationFunction;
	}

	public void setReplicationFunction(String replicationFunction) {
		this.replicationFunction = replicationFunction;
	}

	public int getSplitTime() {
		return this.splitTime;
	}

	public void setSplitTime(int splitTime) {
		this.splitTime = splitTime;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getSvolArrayType() {
		return this.svolArrayType;
	}

	public void setSvolArrayType(String svolArrayType) {
		this.svolArrayType = svolArrayType;
	}

	public int getSvolDevNum() {
		return this.svolDevNum;
	}

	public void setSvolDevNum(int svolDevNum) {
		this.svolDevNum = svolDevNum;
	}

	public String getSvolObjectId() {
		return this.svolObjectId;
	}

	public void setSvolObjectId(String svolObjectId) {
		this.svolObjectId = svolObjectId;
	}

	public int getSvolPoolId() {
		return this.svolPoolId;
	}

	public void setSvolPoolId(int svolPoolId) {
		this.svolPoolId = svolPoolId;
	}

	public int getSvolSerialNumber() {
		return this.svolSerialNumber;
	}

	public void setSvolSerialNumber(int svolSerialNumber) {
		this.svolSerialNumber = svolSerialNumber;
	}
	public void populate(ParseElement pElem){
		
		this.setCopyTrackSize(Integer.parseInt(pElem.getAttribute().get("copyTrackSize")));
		this.setDisplayPvolDevNum(pElem.getAttribute().get("displayPvolDevNum"));
		this.setDisplaySvolDevNum(pElem.getAttribute().get("displaySvolDevNum"));
		this.setFenceLevel(pElem.getAttribute().get("fenceLevel"));
		this.setMuNumber(Integer.parseInt(pElem.getAttribute().get("muNumber")));
		this.setObjectId(pElem.getAttribute().get("objectID"));
		this.setPvolArrayType(pElem.getAttribute().get("pvolArrayType"));
		this.setPvolDevNum(Integer.parseInt(pElem.getAttribute().get("pvolDevNum")));
		this.setPvolObjectId(pElem.getAttribute().get("pvolObjectID"));
		this.setPvolPoolId(Integer.parseInt(pElem.getAttribute().get("pvolPoolID")));
		this.setPvolSerialNumber(Integer.parseInt(pElem.getAttribute().get("pvolSerialNumber")));
		this.setRemotePathGroupId(Integer.parseInt(pElem.getAttribute().get("remotePathGroupID")));
		this.setReplicationFunction(pElem.getAttribute().get("replicationFunction"));
		this.setSplitTime(Integer.parseInt(pElem.getAttribute().get("splitTime")));
		this.setStatus(Integer.parseInt(pElem.getAttribute().get("status")));
		this.setSvolArrayType(pElem.getAttribute().get("svolArrayType"));
		this.setSvolDevNum(Integer.parseInt(pElem.getAttribute().get("svolDevNum")));
		this.setSvolObjectId(pElem.getAttribute().get("svolObjectID"));
		this.setSvolPoolId(Integer.parseInt(pElem.getAttribute().get("svolPoolID")));
		this.setSvolSerialNumber(Integer.parseInt(pElem.getAttribute().get("svolSerialNumber")));
	}

}