package com.jgbemu.core.memory;

interface Memory {
	public byte readAddress(short address);
	public void writeAddress(short address, byte data);
	public byte[] getRamStack();
}
