package com.jgbemu.core.memory;

public class HighRAM implements Memory{
	private byte[] highRAM;
	
	public HighRAM() {
		highRAM = new byte[0xA0];
		for (int i = 0; i < highRAM.length; i++) {
			highRAM[i] = 0x00;
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
		return highRAM;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(highRAM.length * 2);
		for (int i = 0; i < highRAM.length; i++) {
			sb.append(Integer.toHexString(i) + ": ");
			sb.append(String.format("%02x", highRAM[i]));
			sb.append("\n");
		}
		return sb.toString();
	}
}
