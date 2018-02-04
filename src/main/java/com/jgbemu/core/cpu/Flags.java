package com.jgbemu.core.cpu;

public class Flags {
	private final byte Z = (byte) 0x10000000; //Zero - Flag
	private final byte N = (byte) 0x01000000; //Zero - Flag
	private final byte H = (byte) 0x00100000; //Half Carry - Flag
	private final byte C = (byte) 0x00010000; //Carry - Flag

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
}
