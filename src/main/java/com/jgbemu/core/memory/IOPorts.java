package com.jgbemu.core.memory;

public class IOPorts implements IMemory {
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
}
