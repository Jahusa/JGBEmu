package com.jgbemu.core.cpu;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class CPU {
	private int clockrate;
	private Registers register;
	private OPCode[] opcodes;
	private OPCode[] prefixCB;
	
	public CPU() {
		super();
		this.clockrate = 4*1024*1024;
		this.register = new Registers();
		
		this.opcodes = new OPCode[256];
		opcodes[0] = new OPCode((byte)0x00, "LDD", (byte)0x00, (byte)0x00, (byte)3, new byte[]{2,2}, new char[]{'2','2','2','1'});
		
		this.prefixCB = new OPCode[256];
		prefixCB[0] = new OPCode((byte)0x00, "LDD", (byte)0x00, (byte)0x00, (byte)3, new byte[]{2,2}, new char[]{'2','2','2','1'});
	}
	
	/*public void runInstruction() {
		double startTime = System.nanoTime();
	}*/
	
	public void executeOpcode(@NotNull byte opcode, @Nullable short operand1, @Nullable short operand2) {
		switch (opcode) {
		case 0x06:
		case 0x0E:
		case 0x16:
		case 0x1E:
		case 0x26:
		case 0x2E:
			register.setRegisterB((byte) operand1);
			break;

		default:
			break;
		}
	}
	
	private void addressSpaceHelper(short address) {
		if (address >= 0x0000 && address <= 0x7999) {
			
		} else if (address >= 0x8000 && address <= 0x9000) {
			
		} else if (address >= 0x9000 && address <= 0xA000) {
			
		} else if (address >= 0xA000 && address <= 0xB000) {
			
		} else if (address >= 0xC000 && address <= 0xD000) {
			
		} else if (address >= 0xD000 && address <= 0xE000) {
			
		} else if (address >= 0xE000 && address <= 0xF000) {
			
		} else if (address >= 0xF000 && address <= 0xFFFF) {
			
		} else {
			
		}
	}
	
	private void LDD_NN_N() {
		
	}
}
