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

    /**
     * Opcodes are sorted according to this source: http://marc.rawer.de/Gameboy/Docs/GBCPUman.pdf
     *
     * @param opcode
     * @param operand1
     * @param operand2
     */
	public void executeOpcode(@NotNull byte opcode, @Nullable byte operand1, @Nullable byte operand2) {
		switch (opcode) {
		    // 0x06 - 0x2E: ld_nn_n
			case (byte) 0x06:
			    register.writeB(operand1);
			    register.increasePC();
			    cycles += 4;
                break;
			case (byte) 0x0E:
                register.writeC(operand1);
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x16:
                register.writeD(operand1);
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x1E:
                register.writeE(operand1);
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x26:
                register.writeH(operand1);
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x2E:
                register.writeL(operand1);
                register.increasePC();
                cycles += 4;
				break;

			// 0x7F - 0x36: ld_r2_r1
			case (byte) 0x7F:
			    register.writeA(register.readA());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x78:
                register.writeA(register.readB());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x79:
                register.writeA(register.readC());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x7A:
                register.writeA(register.readD());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x7B:
                register.writeA(register.readE());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x7C:
                register.writeA(register.readH());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x7D:
                register.writeA(register.readL());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x7E:
                register.writeA(memoryMap.readDataFromAddress(register.readHL()));
                register.increasePC();
                cycles += 8;
                break;
			case (byte) 0x40:
                register.writeB(register.readB());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x41:
                register.writeB(register.readC());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x42:
                register.writeB(register.readD());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x43:
                register.writeB(register.readE());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x44:
                register.writeB(register.readH());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x45:
                register.writeB(register.readL());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x46:
                register.writeB(memoryMap.readDataFromAddress(register.readHL()));
                register.increasePC();
                cycles += 8;
                break;
			case (byte) 0x48:
                register.writeC(register.readB());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x49:
                register.writeC(register.readC());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x4A:
                register.writeC(register.readD());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x4B:
                register.writeC(register.readE());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x4C:
                register.writeC(register.readH());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x4D:
                register.writeC(register.readL());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x4E:
                register.writeC(memoryMap.readDataFromAddress(register.readHL()));
                register.increasePC();
                cycles += 8;
                break;
			case (byte) 0x50:
                register.writeD(register.readB());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x51:
                register.writeD(register.readC());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x52:
                register.writeD(register.readD());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x53:
                register.writeD(register.readE());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x54:
                register.writeD(register.readH());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x55:
                register.writeD(register.readL());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x56:
                register.writeD(memoryMap.readDataFromAddress(register.readHL()));
                register.increasePC();
                cycles += 8;
                break;
			case (byte) 0x58:
                register.writeE(register.readB());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x59:
                register.writeE(register.readC());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x5A:
                register.writeE(register.readD());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x5B:
                register.writeE(register.readE());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x5C:
                register.writeE(register.readH());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x5D:
                register.writeE(register.readL());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x5E:
                register.writeE(memoryMap.readDataFromAddress(register.readHL()));
                register.increasePC();
                cycles += 8;
                break;
			case (byte) 0x60:
                register.writeH(register.readB());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x61:
                register.writeH(register.readC());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x62:
                register.writeH(register.readD());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x63:
                register.writeH(register.readE());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x64:
                register.writeH(register.readH());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x65:
                register.writeH(register.readL());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x66:
                register.writeH(memoryMap.readDataFromAddress(register.readHL()));
                register.increasePC();
                cycles += 8;
                break;
			case (byte) 0x68:
                register.writeL(register.readB());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x69:
                register.writeL(register.readC());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x6A:
                register.writeL(register.readD());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x6B:
                register.writeL(register.readE());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x6C:
                register.writeL(register.readH());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x6D:
                register.writeL(register.readL());
                register.increasePC();
                cycles += 4;
                break;
			case (byte) 0x6E:
                register.writeL(memoryMap.readDataFromAddress(register.readHL()));
                register.increasePC();
                cycles += 8;
                break;
			case (byte) 0x70:
			    memoryMap.writeDataToAddress(register.readHL(), register.readB());
                register.increasePC();
                cycles += 8;
                break;
			case (byte) 0x71:
                memoryMap.writeDataToAddress(register.readHL(), register.readC());
                register.increasePC();
                cycles += 8;
                break;
			case (byte) 0x72:
                memoryMap.writeDataToAddress(register.readHL(), register.readD());
                register.increasePC();
                cycles += 8;
                break;
			case (byte) 0x73:
                memoryMap.writeDataToAddress(register.readHL(), register.readE());
                register.increasePC();
                cycles += 8;
                break;
			case (byte) 0x74:
                memoryMap.writeDataToAddress(register.readHL(), register.readH());
                register.increasePC();
                cycles += 8;
                break;
			case (byte) 0x75:
                memoryMap.writeDataToAddress(register.readHL(), register.readL());
                register.increasePC();
                cycles += 8;
                break;
            case (byte) 0x36:
                memoryMap.writeDataToAddress(register.readHL(), operand1);
                cycles += 12;
                break;

            // 0x7F - 0x3E: ld_a_n
            case (byte) 0x0A:
                register.writeA(memoryMap.readDataFromAddress(register.readBC()));
                register.increasePC();
                cycles += 8;
                break;
            case (byte) 0x1A:
                register.writeA(memoryMap.readDataFromAddress(register.readDE()));
                register.increasePC();
                cycles += 8;
                break;
            case (byte) 0xFA:
                register.writeA(memoryMap.readDataFromAddress(register.readHL()));
                register.increasePC();
                cycles += 16;
                break;
            case (byte) 0x3E:
                register.writeA(memoryMap.readDataFromAddress(register.readHL()));
                register.increasePC();
                cycles += 8;
                break;

            // 0x7F - 0xEA: ld_n_a
            case (byte) 0x47:
                register.writeB(register.readA());
                register.increasePC();
                cycles += 4;
                break;
            case (byte) 0x4F:
                register.writeC(register.readA());
                register.increasePC();
                cycles += 4;
                break;
            case (byte) 0x57:
                register.writeD(register.readA());
                register.increasePC();
                cycles += 4;
                break;
            case (byte) 0x5F:
                register.writeE(register.readA());
                register.increasePC();
                cycles += 4;
                break;
            case (byte) 0x67:
                register.writeH(register.readA());
                register.increasePC();
                cycles += 4;
                break;
            case (byte) 0x6F:
                register.writeL(register.readA());
                register.increasePC();
                cycles += 4;
                break;
            case (byte) 0x02:
                memoryMap.writeDataToAddress(register.readBC(), register.readA());
                register.increasePC();
                cycles += 8;
                break;
            case (byte) 0x12:
                memoryMap.writeDataToAddress(register.readDE(), register.readA());
                register.increasePC();
                cycles += 8;
                break;
            case (byte) 0x77:
                memoryMap.writeDataToAddress(register.readHL(), register.readA());
                register.increasePC();
                cycles += 8;
                break;
            case (byte) 0xEA:
                memoryMap.writeDataToAddress(combineTwoBytes(operand1, operand2), register.readA());
                register.increasePC();
                cycles += 16;
                break;

            // 0xF2: ld_(c)_a, ld_(c)_a
            case (byte) 0xE2:
            case (byte) 0xF2:
                register.writeA(memoryMap.readDataFromAddress(combineTwoBytes(register.readC(), (byte) 0xFF)));
                register.increasePC();
                cycles += 8;
                break;

            // 0x3A: ld_a_(HLD), ld_a_(HL-), ldd_a_(HL)
            case (byte) 0x3A:
                register.writeA(memoryMap.readDataFromAddress(register.readHL()));
                register.writeHL((short) (register.readHL()-1));
                register.increasePC();
                cycles += 8;
                break;

            // 0x32: ld_(HLD)_a, ld_(HL-)_a, ldd_(HL)_a
            case (byte) 0x32:
                memoryMap.writeDataToAddress(register.readHL(), register.readA());
                register.writeHL((short) (register.readHL()-1));
                register.increasePC();
                cycles += 8;
                break;

            // 0x2A: ld_a_(HLI), ld_a_(HL+), ldi_a_(HL)
            case (byte) 0x2A:
                register.writeA(memoryMap.readDataFromAddress(register.readHL()));
                register.writeHL((short) (register.readHL()+1));
                register.increasePC();
                cycles += 8;
                break;

            // 0x22: ld_(HLI)_a, ld_(HL+)_a, ldi_(HL)_a
            case (byte) 0x22:
                memoryMap.writeDataToAddress(register.readHL(), register.readA());
                register.writeHL((short) (register.readHL()+1));
                register.increasePC();
                cycles += 8;
                break;

            // 0xE0: ldh_(n)_a
            case (byte) 0xE0:
                memoryMap.writeDataToAddress(combineTwoBytes(register.readC(), (byte) 0xFF), register.readA());
                register.increasePC();
                cycles += 12;
                break;

            // 0xF0: ldh_a_(n)
            case (byte) 0xF0:
                register.writeA(memoryMap.readDataFromAddress(combineTwoBytes(operand1, (byte) 0xFF)));
                register.increasePC();
                cycles += 12;
                break;

            // 0x01 - 0x31: ld_rr_nn
            case (byte) 0x01:
                register.writeBC(combineTwoBytes(operand1, operand2));
                register.increasePC();
                cycles += 12;
                break;
            case (byte) 0x11:
                register.writeDE(combineTwoBytes(operand1, operand2));
                register.increasePC();
                cycles += 12;
                break;
            case (byte) 0x21:
                register.writeHL(combineTwoBytes(operand1, operand2));
                register.increasePC();
                cycles += 12;
                break;
            case (byte) 0x31:
                register.writeSP(combineTwoBytes(operand1, operand2));
                register.increasePC();
                cycles += 12;
                break;

            // 0xF9: ld_sp_hl
            case (byte) 0xF9:
                register.writeSP(register.readHL());
                register.increasePC();
                cycles += 12;
                break;

            // 0xF8: ld_hl_sp+1, ldhl_sp+1
            case (byte) 0xF8:
                register.writeHL((short) (register.readSP()+operand1));

                if ((register.readSP() & 0xF) + (operand1 & 0xF) > 0xF) {
                    flags.setHFlags();
                    register.writeF(flags.getFlags());
                }

                if ((register.readSP() & 0xFF) + (operand1 & 0xFF) > 0xFF) {
                    flags.setHFlags();
                    register.writeF(flags.getFlags());
                }

                register.increasePC();
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

    /**
     * converts two byte values to one short value (little endian)
     *
     * @param lsb least significant byte
     * @param msb least significant byte
     * @return converted bytes into short
     */
	private short combineTwoBytes(byte lsb, byte msb) {
	    return (short) (((msb & 0xFF) << 8) | (lsb & 0xFF));
    }

    /*
    public static void main(String[] args) {
        System.out.println(Integer.toHexString(combineTwoBytes((byte) 0xBB, (byte) 0xD0) & 0xFFFF));
    }
    */
}
