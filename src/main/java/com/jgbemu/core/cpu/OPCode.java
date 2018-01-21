package com.jgbemu.core.cpu;

class OPCode {
	private byte address;
	private String mnemonic;
	private byte operand1;
	private byte operand2;
	
	private byte length;
	private byte[] cycles;
	
	private char[] flags;

	public OPCode(byte address, String mnemonic, byte operand1, byte operand2, byte length, byte[] cycles, char[] flags) {
		super();
		this.address = address;
		this.mnemonic = mnemonic;
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.length = length;
		this.cycles = cycles;
		this.flags = flags;
	}

	public byte getAddress() {
		return address;
	}

	public String getMnemonic() {
		return mnemonic;
	}

	public byte getOperand1() {
		return operand1;
	}

	public byte getOperand2() {
		return operand2;
	}

	public byte getLength() {
		return length;
	}

	public byte[] getCycles() {
		return cycles;
	}

	public char[] getFlags() {
		return flags;
	}
}
