package com.hitachi.hibernate.entities;

// Generated Dec 16, 2011 4:19:34 AM by Hibernate Tools 3.4.0.CR1

/**
 * LogicalunitId generated by hbm2java
 */
public class LogicalunitId implements java.io.Serializable {

	private int devNum;
	private String displayName;
	private String objectId;

	public LogicalunitId() {
	}

	public LogicalunitId(int devNum, String displayName, String objectId) {
		this.devNum = devNum;
		this.displayName = displayName;
		this.objectId = objectId;
	}

	public int getDevNum() {
		return this.devNum;
	}

	public void setDevNum(int devNum) {
		this.devNum = devNum;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getObjectId() {
		return this.objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LogicalunitId))
			return false;
		LogicalunitId castOther = (LogicalunitId) other;

		return (this.getDevNum() == castOther.getDevNum())
				&& ((this.getDisplayName() == castOther.getDisplayName()) || (this
						.getDisplayName() != null
						&& castOther.getDisplayName() != null && this
						.getDisplayName().equals(castOther.getDisplayName())))
				&& ((this.getObjectId() == castOther.getObjectId()) || (this
						.getObjectId() != null
						&& castOther.getObjectId() != null && this
						.getObjectId().equals(castOther.getObjectId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getDevNum();
		result = 37
				* result
				+ (getDisplayName() == null ? 0 : this.getDisplayName()
						.hashCode());
		result = 37 * result
				+ (getObjectId() == null ? 0 : this.getObjectId().hashCode());
		return result;
	}

}
