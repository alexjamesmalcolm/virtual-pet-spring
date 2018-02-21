package com.virtualpet.virtualpetspring;

public class LitterBox extends Box {

	public LitterBox() {
		this(DEFAULT_DIRTYNESS);
	}

	public LitterBox(int dirtyness) {
		this.dirtyness = dirtyness;
	}

}
