package com.jgbemu.core.cpu;

class Registers {
	private byte registerA;
	private byte registerF;
	private byte registerB;
	private byte registerC;
	private byte registerD;
	private byte registerE;
	private byte registerH;
	private byte registerL;
	private short registerSP;
	private short registerPC;
	
	public Registers() {
		this.registerA = 0;
		this.registerF = 0;
		this.registerB = 0;
		this.registerC = 0;
		this.registerD = 0;
		this.registerE = 0;
		this.registerH = 0;
		this.registerL = 0;
		this.registerSP = 0;
		this.registerPC = 0;
	}
	
	//TODO fix byte convertion -> little endian

	public byte readA() {
		return registerA;
	}

	public byte readF() {
		return registerF;
	}

	public byte readB() {
		return registerB;
	}

	public byte readC() {
		return registerC;
	}

	public byte readD() {
		return registerD;
	}

	public byte readE() {
		return registerE;
	}

	public byte readH() {
		return registerH;
	}

	public byte readL() {
		return registerL;
	}

	public short readAF() {
		return (short)(((registerA & 0xFF) << 8) | (registerF & 0xFF));
	}

	public short readBC() {
		return (short) (((registerB & 0xFF) << 8) | (registerC & 0xFF));
	}

	public short readDE() {
		return (short) (((registerD & 0xFF) << 8) | (registerE & 0xFF));
	}

	public short readHL() {
		return (short) (((registerH & 0xFF) << 8) | (registerL & 0xFF));
	}

	public short readSP() {
		return registerSP;
	}

	public short readPC() {
		return registerPC;
	}

	public void writeA(byte data) {
		this.registerA = registerA;
	}

	public void writeF(byte data) {
		this.registerF = registerF;
	}

	public void writeB(byte data) {
		this.registerB = registerB;
	}

	public void writeC(byte data) {
		this.registerC = registerC;
	}

	public void writeD(byte data) {
		this.registerD = registerD;
	}

	public void writeE(byte data) {
		this.registerE = registerE;
	}

	public void writeH(byte data) {
		this.registerH = registerH;
	}

	public void writeL(byte data) {
		this.registerL = registerL;
	}

	public void writeAF(short data) {
		this.registerA = (byte)(data & 0xff);
		this.registerF = (byte)((data >> 8) & 0xff);
	}

	public void writeBC(short data) {
		this.registerB = (byte)(data & 0xff);
		this.registerC = (byte)((data >> 8) & 0xff);
	}

	public void writeDE(short data) {
		this.registerD = (byte)(data & 0xff);
		this.registerE = (byte)((data >> 8) & 0xff);
	}
	
	public void writeHL(short data) {
		this.registerH = (byte)(data & 0xff);
		this.registerL = (byte)((data >> 8) & 0xff);
	}

	public void writeSP(short registerSP) {
		this.registerSP = registerSP;
	}

	public void writePC(short registerPC) {
		this.registerPC = registerPC;
	}

	public void increasePC(short count) {
		this.registerPC += count;
	}
}
