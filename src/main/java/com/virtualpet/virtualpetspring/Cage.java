package com.virtualpet.virtualpetspring;

public class Cage extends Box {

	public Cage(int dirtyness) {
		this.dirtyness = dirtyness;
	}

	public Cage() {
		this(DEFAULT_DIRTYNESS);
	}

}
