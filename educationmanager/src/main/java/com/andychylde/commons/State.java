package com.andychylde.commons;

public enum State {

	ABIA("Umuahia", GeoPoliticalZone.SOUTH_EAST), 
	ADAMAWA("Yola", GeoPoliticalZone.NORTH_EAST), 
	AKWA_IBOM("Uyo",GeoPoliticalZone.SOUTH_SOUTH), 
	ANAMBRA("Awka", GeoPoliticalZone.SOUTH_EAST), 
	BAUCHI("Bauchi",GeoPoliticalZone.NORTH_EAST), 
	BAYELSA("Yenagoa",GeoPoliticalZone.SOUTH_SOUTH), 
	BENUE("Makurdi",GeoPoliticalZone.NORTH_CENTRAL), 
	BORNO("Maiduguri",GeoPoliticalZone.NORTH_EAST), 
	CROSS_RIVER("Calabar",GeoPoliticalZone.SOUTH_SOUTH), 
	DELTA("Asaba",GeoPoliticalZone.SOUTH_SOUTH), 
	EBONYI("Abakaliki",GeoPoliticalZone.SOUTH_EAST), 
	EDO("Benin",GeoPoliticalZone.SOUTH_SOUTH), 
	EKITI("Ado Ekiti",GeoPoliticalZone.SOUTH_WEST), 
	ENUGU("Enugu",GeoPoliticalZone.SOUTH_EAST), 
	GOMBE("Gombe",GeoPoliticalZone.NORTH_EAST), 
	IMO("Owerri",GeoPoliticalZone.SOUTH_EAST), 
	JIGAWA("Dutse",GeoPoliticalZone.NORTH_WEST), 
	KADUNA("Kaduna",GeoPoliticalZone.NORTH_WEST), 
	KANO("Kano",GeoPoliticalZone.NORTH_WEST), 
	KATSINA("Katsina",GeoPoliticalZone.NORTH_WEST), 
	KEBBI("Birnin Kebbi",GeoPoliticalZone.NORTH_WEST), 
	KOGI("Lokoja",GeoPoliticalZone.NORTH_CENTRAL), 
	KWARA("Ilorin",GeoPoliticalZone.NORTH_CENTRAL), 
	LAGOS("Ikeja",GeoPoliticalZone.SOUTH_WEST), 
	NASARAWA("Lafia",GeoPoliticalZone.NORTH_CENTRAL), 
	NIGER("Minna",GeoPoliticalZone.NORTH_CENTRAL), 
	OGUN("Abeokuta",GeoPoliticalZone.SOUTH_WEST), 
	ONDO("Akure",GeoPoliticalZone.SOUTH_WEST), 
	OSUN("Osogbo",GeoPoliticalZone.SOUTH_WEST), 
	OYO("Ibadan",GeoPoliticalZone.SOUTH_WEST), 
	PLATEAU("Jos",GeoPoliticalZone.NORTH_CENTRAL), 
	RIVERS("Port Harcourt",GeoPoliticalZone.SOUTH_SOUTH), 
	SOKOTO("Sokoto",GeoPoliticalZone.NORTH_WEST), 
	TARABA("Jalingo",GeoPoliticalZone.NORTH_EAST), 
	YOBE("Yobe",GeoPoliticalZone.NORTH_EAST), 
	ZAMFARA("Gusau",GeoPoliticalZone.NORTH_WEST);
	// Attributes
	private String capital;
	private GeoPoliticalZone gpz;

	// Constructors
	// private State() {
	//
	// }
	//
	// private State(String capital) {
	// this.capital = capital;
	// }

	private State(String capital, GeoPoliticalZone gpz) {
		this.capital = capital;
		this.gpz = gpz;
	}

	// Setters and Getters
	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public GeoPoliticalZone getGpz() {
		return gpz;
	}

	public void setGpz(GeoPoliticalZone gpz) {
		this.gpz = gpz;
	}
	
	public String toString(){
		
		return this.name()+", "+this.getGpz().toString()+ " "+this.getCapital();
	}

}
