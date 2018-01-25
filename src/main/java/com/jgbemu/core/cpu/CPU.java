package com.jgbemu.core.cpu;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class CPU {
	private int clockrate;
	private long cycles;
	private Registers register;
	private OPCode[] opcodes;
	private OPCode[] prefixCB;

	//private boolean vramAccessable;
	//private boolean oamAccessable;
	
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
				ld_nn_n(opcode, (byte) operand1);
				break;
			case 0x7F:
			case 0x78:
			case 0x79:
			case 0x7A:
			case 0x7B:
			case 0x7C:
			case 0x7D:
			case 0x7E:
			case 0x40:
			case 0x41:
			case 0x42:
			case 0x43:
			case 0x44:
			case 0x45:
			case 0x46:
			case 0x48:
			case 0x49:
			case 0x4A:
			case 0x4B:
			case 0x4C:
			case 0x4D:
			case 0x4E:
			case 0x50:
			case 0x51:
			case 0x52:
			case 0x53:
			case 0x54:
			case 0x55:
			case 0x56:
			case 0x58:
			case 0x59:
			case 0x5A:
			case 0x5B:
			case 0x5C:
			case 0x5D:
			case 0x5E:
			case 0x60:
			case 0x61:
			case 0x62:
			case 0x63:
			case 0x64:
			case 0x65:
			case 0x66:
			case 0x68:
			case 0x69:
			case 0x6A:
			case 0x6B:
			case 0x6C:
			case 0x6D:
			case 0x6E:
			case 0x70:
			case 0x71:
			case 0x72:
			case 0x73:
			case 0x74:
			case 0x75:
			case 0x36:
				ld_r1_r2(opcode);
				break;

			default:
				break;
		}
	}

	/**
	 * This function helps finding the right address space across all Memory classes;
	 *
	 * @param address
	 *
	private void addressSpaceHelper(short address) {
		if (address >= (short) 0x0000 && address <= (short) 0x7FFF) {
			
		} else if (address >= (short) 0x8000 && address <= (short) 0x9000) {
			
		} else if (address >= (short) 0x9000 && address <= (short) 0xA000) {

		} else if (address >= (short) 0xA000 && address <= (short) 0xB000) {
			
		} else if (address >= (short) 0xC000 && address <= (short) 0xD000) {
			
		} else if (address >= (short) 0xD000 && address <= (short) 0xE000) {
			
		} else if (address >= (short) 0xE000 && address <= (short) 0xF000) {
			
		} else if (address >= (short) 0xF000 && address <= (short) 0xFFFF) {
			
		} else {
			
		}
	}*/

	private void NOP(){
		//TODO: wait for 4 cycles
	}

	/**
	 * load a 8 bit immediate value into B,C,D,E,H,L
	 *
	 * @param opcode
	 * @param operand
	 */
	private void ld_nn_n(byte opcode, byte operand) {
		switch (opcode) {
			case 0x06:
				register.setRegisterB(operand);
				break;

			case 0x0E:
				register.setRegisterC(operand);
				break;

			case 0x16:
				register.setRegisterD(operand);
				break;

			case 0x1E:
				register.setRegisterE(operand);
				break;

			case 0x26:
				register.setRegisterH(operand);
				break;

			case 0x2E:
				register.setRegisterH(operand);
				break;

			default:
				break;
		}
		//TODO: advance 8 cycles
	}

	/**
	 * Put value of Register2 into Register1
	 *
	 * @param opcode
	 */
	private void ld_r1_r2(byte opcode) {
		switch (opcode) {
			case 0x7F:
				break;

			case 0x78:
				break;

			case 0x79:
				break;

			case 0x7A:
				break;

			case 0x7B:
				break;

			case 0x7C:
				break;

			case 0x7D:
				break;

			case 0x7E:
				break;

			case 0x40:
				break;

			case 0x41:
				break;

			case 0x42:
				break;

			case 0x43:
				break;

			case 0x44:
				break;

			case 0x45:
				break;

			case 0x46:
				break;

			case 0x48:
				break;

			case 0x49:
				break;

			case 0x4A:
				break;

			case 0x4B:
				break;

			case 0x4C:
				break;

			case 0x4D:
				break;

			case 0x4E:
				break;

			case 0x50:
				break;

			case 0x51:
				break;

			case 0x52:
				break;

			case 0x53:
				break;

			case 0x54:
				break;

			case 0x55:
				break;

			case 0x56:
				break;

			case 0x58:
				break;

			case 0x59:
				break;

			case 0x5A:
				break;

			case 0x5B:
				break;

			case 0x5C:
				break;

			case 0x5D:
				break;

			case 0x5E:
				break;

			case 0x60:
				break;

			case 0x61:
				break;

			case 0x62:
				break;

			case 0x63:
				break;

			case 0x64:
				break;

			case 0x65:
				break;

			case 0x66:
				break;

			case 0x68:
				break;

			case 0x69:
				break;

			case 0x6A:
				break;

			case 0x6B:
				break;

			case 0x6C:
				break;

			case 0x6D:
				break;

			case 0x6E:
				break;

			case 0x70:
				break;

			case 0x71:
				break;

			case 0x72:
				break;

			case 0x73:
				break;

			case 0x74:
				break;

			case 0x75:
				break;

			case 0x36:
				break;

			default:
				break;
		}
	}
}
