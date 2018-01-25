package com.jgbemu.core.memory;

public class OAM implements Memory{
	private final short offset = (short) 0xFE00;
	private byte[] oam;
	
	public OAM() {
		oam = new byte[0xA0];
		for (int i = 0; i < oam.length; i++) {
			oam[i] = 0x00;
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
		return oam;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(oam.length * 2);
		for (int i = 0; i < oam.length; i++) {
			sb.append(Integer.toHexString(i & offset) + ": ");
			sb.append(String.format("%02x", oam[i]));
			sb.append("\n");
		}
		return sb.toString();
	}
}
