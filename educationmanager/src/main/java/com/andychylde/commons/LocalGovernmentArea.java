package com.andychylde.commons;

public enum LocalGovernmentArea {
	
	ABA_NORTH(State.ABIA),	
	ABA_SOUTH(State.ABIA), 	
	AROCHUKWU(State.ABIA),	
	BENDE(State.ABIA), 	
	IKWUANO(State.ABIA), 	
	ISIALA_NGWA_NORTH(State.ABIA), 	
	ISIALA_NGWA_SOUTH(State.ABIA), 	
	ISUIKWUATO (State.ABIA), 	
	OBI_NGWA (State.ABIA), 	
	OHAFIA (State.ABIA), 	
	OSISIOMA(State.ABIA), 	
	UGWUNAGBO(State.ABIA), 	
	UKWA_EAST(State.ABIA), 	
	UKWA_WEST(State.ABIA), 	
	UMUAHIA_NORTH (State.ABIA), 	
	UMUAHIA_SOUTH (State.ABIA), 	
	UMU_NNEOCHI(State.ABIA), 
	DEMSA(State.ADAMAWA),	
	FUFURE 	(State.ADAMAWA), 	
	GANYE 	(State.ADAMAWA), 	
	GAYUK 	(State.ADAMAWA), 	
	GOMBI 	(State.ADAMAWA), 	
	GRIE 	(State.ADAMAWA), 	
	HONG 	(State.ADAMAWA), 	
	JADA 	(State.ADAMAWA), 	
	LAMURDE 	(State.ADAMAWA), 	
	MADAGALI 	(State.ADAMAWA), 	
	MAIHA 	(State.ADAMAWA),	
	MAYO_BELWA 	(State.ADAMAWA), 	
	MICHIKA 	(State.ADAMAWA), 	
	MUBI_NORTH 	(State.ADAMAWA), 	
	MUBI_SOUTH 	(State.ADAMAWA), 	
	NUMAN 	(State.ADAMAWA), 	
	SHELLENG 	(State.ADAMAWA), 	
	SONG 	(State.ADAMAWA), 	
	TOUNGO 	(State.ADAMAWA), 	
	YOLA_NORTH 	(State.ADAMAWA), 	
	YOLA_SOUTH 	(State.ADAMAWA);


	// Attributes
		State state;
//		Constructor

	private LocalGovernmentArea(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
		


}
