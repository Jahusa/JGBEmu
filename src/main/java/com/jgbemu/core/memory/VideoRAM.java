package com.jgbemu.core.memory;

public class VideoRAM implements Memory {
	private final short offset = (short) 0x8000;
	private byte[] videoRam;
	
	public VideoRAM() {
		videoRam = new byte[0x8000];
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
}