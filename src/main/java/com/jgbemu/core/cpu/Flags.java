package com.jgbemu.core.cpu;

public class Flags {
	private byte Z;
	private byte N;
	private byte H;
	private byte C;

	private byte flags;
	
	public Flags() {
		this.Z = (byte) 0x10000000;
		this.N = (byte) 0x01000000;
		this.H = (byte) 0x00100000;
		this.C = (byte) 0x00010000;
	}


}
