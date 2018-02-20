package com.jgbemu.core.cpu;

public class Flags {
	private final byte Z = (byte) 0b10000000; //Zero - Flag
	private final byte N = (byte) 0b01000000; //Zero - Flag
	private final byte H = (byte) 0b00100000; //Half Carry - Flag
	private final byte C = (byte) 0b00010000; //Carry - Flag

	private byte flags;
	
	public Flags() {
        this.flags = (byte) 0x00;
	}

    public void setZFlags() {
        this.flags |= Z;
    }

    public void setNFlags() {
        this.flags |= N;
    }

    public void setHFlags() {
        this.flags |= H;
    }

    public void setCFlags() {
        this.flags |= C;
    }

    public void resetZFlags() {
        this.flags &= Z;
    }

    public void resetNFlags() {
        this.flags &= N;
    }

    public void resetHFlags() {
        this.flags &= H;
    }

    public void resetCFlags() {
        this.flags &= C;
    }

    public byte getFlags() {
        return flags;
    }

    @Override
    public String toString() {
        return "flags=" + String.format("%8s", Integer.toBinaryString(flags & 0xFF)).replace(' ', '0');
    }
}
