package com.jgbemu.core.memory;

public class IOPorts implements IMemory {
	private final short offset = (short) 0xFE00;
	private byte[] ioPorts;
	
	public IOPorts() {
		ioPorts = new byte[0xA0];
		for (int i = 0; i < ioPorts.length; i++) {
			ioPorts[i] = 0x00;
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
		return ioPorts;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(ioPorts.length * 2);
		for (int i = 0; i < ioPorts.length; i++) {
			sb.append(Integer.toHexString(i & offset) + ": ");
			sb.append(String.format("%02x", ioPorts[i]));
			sb.append("\n");
		}
		return sb.toString();
	}
}
