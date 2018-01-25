package com.jgbemu.core.memory;

public class ExternalRAM implements Memory {
	private final short offset = (short) 0xA000;
	private byte[] externalRam;
	
	public ExternalRAM() {
		externalRam = new byte[0x8000];
		for (int i = 0; i < externalRam.length; i++) {
			externalRam[i] = 0x00;
		}
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
		return externalRam;
	}
}
