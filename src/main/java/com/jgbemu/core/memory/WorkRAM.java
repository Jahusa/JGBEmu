package com.jgbemu.core.memory;

public class WorkRAM implements IMemory {
	private byte selectedBank;
	private byte[] workRam;
	
	public WorkRAM() {
		workRam = new byte[0x8000];
	}

	@Override
	public byte readAddress(short address) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeAddress(short address, byte data) {
		// TODO Auto-generated method stub
	}

	@Override
	public byte[] getRamStack() {
		return workRam;
	}
}
