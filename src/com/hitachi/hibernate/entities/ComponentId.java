package com.hitachi.hibernate.entities;

// Generated Dec 1, 2011 1:12:09 AM by Hibernate Tools 3.4.0.CR1

/**
 * ComponentId generated by hbm2java
 */
public class ComponentId implements java.io.Serializable {

	private String description;
	private String name;
	private int value;

	public ComponentId() {
	}

	public ComponentId(String description, String name, int value) {
		this.description = description;
		this.name = name;
		this.value = value;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ComponentId))
			return false;
		ComponentId castOther = (ComponentId) other;

		return ((this.getDescription() == castOther.getDescription()) || (this
				.getDescription() != null && castOther.getDescription() != null && this
				.getDescription().equals(castOther.getDescription())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& (this.getValue() == castOther.getValue());
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDescription() == null ? 0 : this.getDescription()
						.hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + this.getValue();
		return result;
	}

}
