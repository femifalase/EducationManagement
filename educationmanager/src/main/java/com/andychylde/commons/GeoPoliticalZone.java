package com.andychylde.commons;

public enum GeoPoliticalZone {
	
	NORTH_CENTRAL("Central Nigeria"),NORTH_EAST("North Eastern Nigeria"), NORTH_WEST("North Western Nigeria"),
	SOUTH_EAST("South Eastern Nigeria"), SOUTH_SOUTH("The South South"), SOUTH_WEST("South Western Nigeria");
	String gpzName;

	GeoPoliticalZone(String gpzName) {
		this.gpzName = gpzName;
	}

	public String getGpzName() {
		return gpzName;
	}

	public void setGpzName(String gpzName) {
		this.gpzName = gpzName;
	}

	@Override
	public String toString() {
		return this.name()+": " + this.getGpzName();
	}
}
