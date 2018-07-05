package com.seats.arrangement.dto;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class BayDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String bayName;

	private String floorId;

	private String wingId;

	private List<List<SeatDTO>> listOfSeatsList;

	public String getBayName() {
		return bayName;
	}

	public void setBayName(String bayName) {
		this.bayName = bayName;
	}

	public String getFloorId() {
		return floorId;
	}

	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}

	public String getWingId() {
		return wingId;
	}

	public void setWingId(String wingId) {
		this.wingId = wingId;
	}

	public List<List<SeatDTO>> getListOfSeatsList() {
		return listOfSeatsList;
	}

	public void setListOfSeatsList(List<List<SeatDTO>> listOfSeatsList) {
		this.listOfSeatsList = listOfSeatsList;
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, false);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
