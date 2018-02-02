package com.jgbemu.core.cpu;

import com.jgbemu.core.memory.MemoryMap;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class CPU {
	private int clockrate;
	private long cycles;

	private Registers register;
    private Flags flags;
	private MemoryMap memoryMap;

	//private boolean vramAccessable;
	//private boolean oamAccessable;
	
	public CPU() {
		super();
		this.clockrate = 4*1024*1024;
		this.cycles = 0;

		this.register = new Registers();
		this.flags = new Flags();
		this.memoryMap = new MemoryMap("");
	}
	
	/*public void runInstruction() {
		double startTime = System.nanoTime();
	}*/
	
	public void executeOpcode(@NotNull byte opcode, @Nullable byte operand1, @Nullable byte operand2) {
		switch (opcode) {
		    // 0x06 - 0x2E: ld_nn_n
			case 0x06:
			    register.writeB(operand1);
			    register.increasePC();
			    cycles += 4;
                break;
			case 0x0E:
                register.writeC(operand1);
                register.increasePC();
                cycles += 4;
                break;
			case 0x16:
                register.writeD(operand1);
                register.increasePC();
                cycles += 4;
                break;
			case 0x1E:
                register.writeE(operand1);
                register.increasePC();
                cycles += 4;
                break;
			case 0x26:
                register.writeH(operand1);
                register.increasePC();
                cycles += 4;
                break;
			case 0x2E:
                register.writeL(operand1);
                register.increasePC();
                cycles += 4;
				break;

			// 0x7F - 0x36: ld_r2_r1
			case 0x7F:
			    register.writeA(register.readA());
                register.increasePC();
                cycles += 4;
                break;
			case 0x78:
                register.writeA(register.readB());
                register.increasePC();
                cycles += 4;
                break;
			case 0x79:
                register.writeA(register.readC());
                register.increasePC();
                cycles += 4;
                break;
			case 0x7A:
                register.writeA(register.readD());
                register.increasePC();
                cycles += 4;
                break;
			case 0x7B:
                register.writeA(register.readE());
                register.increasePC();
                cycles += 4;
                break;
			case 0x7C:
                register.writeA(register.readH());
                register.increasePC();
                cycles += 4;
                break;
			case 0x7D:
                register.writeA(register.readL());
                register.increasePC();
                cycles += 4;
                break;
			case 0x7E:
                register.writeA(memoryMap.readDataFromAddress(register.readHL()));
                register.increasePC();
                cycles += 8;
                break;
			case 0x40:
                register.writeB(register.readB());
                register.increasePC();
                cycles += 4;
                break;
			case 0x41:
                register.writeB(register.readC());
                register.increasePC();
                cycles += 4;
                break;
			case 0x42:
                register.writeB(register.readD());
                register.increasePC();
                cycles += 4;
                break;
			case 0x43:
                register.writeB(register.readE());
                register.increasePC();
                cycles += 4;
                break;
			case 0x44:
                register.writeB(register.readH());
                register.increasePC();
                cycles += 4;
                break;
			case 0x45:
                register.writeB(register.readL());
                register.increasePC();
                cycles += 4;
                break;
			case 0x46:
                register.writeB(memoryMap.readDataFromAddress(register.readHL()));
                register.increasePC();
                cycles += 8;
                break;
			case 0x48:
                register.writeC(register.readB());
                register.increasePC();
                cycles += 4;
                break;
			case 0x49:
                register.writeC(register.readC());
                register.increasePC();
                cycles += 4;
                break;
			case 0x4A:
                register.writeC(register.readD());
                register.increasePC();
                cycles += 4;
                break;
			case 0x4B:
                register.writeC(register.readE());
                register.increasePC();
                cycles += 4;
                break;
			case 0x4C:
                register.writeC(register.readH());
                register.increasePC();
                cycles += 4;
                break;
			case 0x4D:
                register.writeC(register.readL());
                register.increasePC();
                cycles += 4;
                break;
			case 0x4E:
                register.writeC(memoryMap.readDataFromAddress(register.readHL()));
                register.increasePC();
                cycles += 8;
                break;
			case 0x50:
                register.writeD(register.readB());
                register.increasePC();
                cycles += 4;
                break;
			case 0x51:
                register.writeD(register.readC());
                register.increasePC();
                cycles += 4;
                break;
			case 0x52:
                register.writeD(register.readD());
                register.increasePC();
                cycles += 4;
                break;
			case 0x53:
                register.writeD(register.readE());
                register.increasePC();
                cycles += 4;
                break;
			case 0x54:
                register.writeD(register.readH());
                register.increasePC();
                cycles += 4;
                break;
			case 0x55:
                register.writeD(register.readL());
                register.increasePC();
                cycles += 4;
                break;
			case 0x56:
                register.writeD(memoryMap.readDataFromAddress(register.readHL()));
                register.increasePC();
                cycles += 8;
                break;
			case 0x58:
                register.writeE(register.readB());
                register.increasePC();
                cycles += 4;
                break;
			case 0x59:
                register.writeE(register.readC());
                register.increasePC();
                cycles += 4;
                break;
			case 0x5A:
                register.writeE(register.readD());
                register.increasePC();
                cycles += 4;
                break;
			case 0x5B:
                register.writeE(register.readE());
                register.increasePC();
                cycles += 4;
                break;
			case 0x5C:
                register.writeE(register.readH());
                register.increasePC();
                cycles += 4;
                break;
			case 0x5D:
                register.writeE(register.readL());
                register.increasePC();
                cycles += 4;
                break;
			case 0x5E:
                register.writeE(memoryMap.readDataFromAddress(register.readHL()));
                register.increasePC();
                cycles += 8;
                break;
			case 0x60:
                register.writeH(register.readB());
                register.increasePC();
                cycles += 4;
                break;
			case 0x61:
                register.writeH(register.readC());
                register.increasePC();
                cycles += 4;
                break;
			case 0x62:
                register.writeH(register.readD());
                register.increasePC();
                cycles += 4;
                break;
			case 0x63:
                register.writeH(register.readE());
                register.increasePC();
                cycles += 4;
                break;
			case 0x64:
                register.writeH(register.readH());
                register.increasePC();
                cycles += 4;
                break;
			case 0x65:
                register.writeH(register.readL());
                register.increasePC();
                cycles += 4;
                break;
			case 0x66:
                register.writeH(memoryMap.readDataFromAddress(register.readHL()));
                register.increasePC();
                cycles += 8;
                break;
			case 0x68:
                register.writeL(register.readB());
                register.increasePC();
                cycles += 4;
                break;
			case 0x69:
                register.writeL(register.readC());
                register.increasePC();
                cycles += 4;
                break;
			case 0x6A:
                register.writeL(register.readD());
                register.increasePC();
                cycles += 4;
                break;
			case 0x6B:
                register.writeL(register.readE());
                register.increasePC();
                cycles += 4;
                break;
			case 0x6C:
                register.writeL(register.readH());
                register.increasePC();
                cycles += 4;
                break;
			case 0x6D:
                register.writeL(register.readL());
                register.increasePC();
                cycles += 4;
                break;
			case 0x6E:
                register.writeL(memoryMap.readDataFromAddress(register.readHL()));
                register.increasePC();
                cycles += 8;
                break;
			case 0x70:
			    memoryMap.writeDataFromAddress(register.readHL(), register.readB());
                register.increasePC();
                cycles += 8;
                break;
			case 0x71:
                memoryMap.writeDataFromAddress(register.readHL(), register.readC());
                register.increasePC();
                cycles += 8;
                break;
			case 0x72:
                memoryMap.writeDataFromAddress(register.readHL(), register.readD());
                register.increasePC();
                cycles += 8;
                break;
			case 0x73:
                memoryMap.writeDataFromAddress(register.readHL(), register.readE());
                register.increasePC();
                cycles += 8;
                break;
			case 0x74:
                memoryMap.writeDataFromAddress(register.readHL(), register.readH());
                register.increasePC();
                cycles += 8;
                break;
			case 0x75:
                memoryMap.writeDataFromAddress(register.readHL(), register.readL());
                register.increasePC();
                cycles += 8;
                break;
			case 0x36:
                memoryMap.writeDataFromAddress(register.readHL(), operand1);
                cycles += 12;
                break;

            // illegal opcode
            case (byte) 0xD3:
            case (byte) 0xDB:
            case (byte) 0xDD:
            case (byte) 0xE3:
            case (byte) 0xE4:
            case (byte) 0xEB:
            case (byte) 0xEC:
            case (byte) 0xED:
            case (byte) 0xF4:
            case (byte) 0xFC:
            case (byte) 0xFD:
                System.err.println("illegal opcode");
			default:
				break;
		}
	}

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
				register.writeB(operand);
				break;

			case 0x0E:
				register.writeC(operand);
				break;

			case 0x16:
				register.writeD(operand);
				break;

			case 0x1E:
				register.writeE(operand);
				break;

			case 0x26:
				register.writeH(operand);
				break;

			case 0x2E:
				register.writeH(operand);
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
