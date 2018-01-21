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

	public byte getRegisterA() {
		return registerA;
	}

	public byte getRegisterF() {
		return registerF;
	}

	public short getRegisterAF() {
		return (short)(((registerA & 0xFF) << 8) | (registerF & 0xFF));
	}

	public byte getRegisterB() {
		return registerB;
	}

	public byte getRegisterC() {
		return registerC;
	}

	public short getRegisterBC() {
		return (short) (((registerB & 0xFF) << 8) | (registerC & 0xFF));
	}

	public byte getRegisterD() {
		return registerD;
	}

	public byte getRegisterE() {
		return registerE;
	}

	public short getRegisterDE() {
		return (short) (((registerD & 0xFF) << 8) | (registerE & 0xFF));
	}

	public byte getRegisterH() {
		return registerH;
	}

	public byte getRegisterL() {
		return registerL;
	}

	public short getRegisterHL() {
		return (short) (((registerH & 0xFF) << 8) | (registerL & 0xFF));
	}

	public short getRegisterSP() {
		return registerSP;
	}

	public short getRegisterPC() {
		return registerPC;
	}

	public void setRegisterA(byte registerA) {
		this.registerA = registerA;
	}

	public void setRegisterF(byte registerF) {
		this.registerF = registerF;
	}
	
	public void setRegisterAF(short registerAF) {
		this.registerA = (byte)(registerAF & 0xff);
		this.registerF = (byte)((registerAF >> 8) & 0xff);
	}

	public void setRegisterB(byte registerB) {
		this.registerB = registerB;
	}

	public void setRegisterC(byte registerC) {
		this.registerC = registerC;
	}
	
	public void setRegisterBC(short registerBC) {
		this.registerB = (byte)(registerBC & 0xff);
		this.registerC = (byte)((registerBC >> 8) & 0xff);
	}

	public void setRegisterD(byte registerD) {
		this.registerD = registerD;
	}

	public void setRegisterE(byte registerE) {
		this.registerE = registerE;
	}
	
	public void setRegisterDE(short registerDE) {
		this.registerD = (byte)(registerDE & 0xff);
		this.registerE = (byte)((registerDE >> 8) & 0xff);
	}

	public void setRegisterH(byte registerH) {
		this.registerH = registerH;
	}

	public void setRegisterL(byte registerL) {
		this.registerL = registerL;
	}
	
	public void setRegisterHL(short registerHL) {
		this.registerH = (byte)(registerHL & 0xff);
		this.registerL = (byte)((registerHL >> 8) & 0xff);
	}

	public void setRegisterSP(short registerSP) {
		this.registerSP = registerSP;
	}

	public void setRegisterPC(short registerPC) {
		this.registerPC = registerPC;
	}
}
