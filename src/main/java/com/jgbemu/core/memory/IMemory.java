package com.jgbemu.core.memory;

interface IMemory {
	public byte readAddress(short address);
	public void writeAddress(short address, byte data);
	public byte[] getRamStack();
}
