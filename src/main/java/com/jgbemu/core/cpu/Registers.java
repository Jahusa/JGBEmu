package com.jgbemu.core.cpu;

class Registers {
	public static int REGISTER_A = 1;
	public static int REGISTER_F = 2;
	public static int REGISTER_B = 3;
	public static int REGISTER_C = 4;
	public static int REGISTER_D = 5;
	public static int REGISTER_E = 6;
	public static int REGISTER_H = 7;
	public static int REGISTER_L = 8;

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

	public void putRegister(int register2, byte register1) {
		switch (register2) {
			case 1:
				this.registerA = register1;
				break;

			case 2:
				this.registerF = register1;
				break;

			case 3:
				this.registerB = register1;
				break;

			case 4:
				this.registerC = register1;
				break;

			case 5:
				this.registerD = register1;
				break;

			case 6:
				this.registerE = register1;
				break;

			case 7:
				this.registerH = register1;
				break;

			case 8:
				this.registerL = register1;
				break;

			default:
				break;
		}
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
