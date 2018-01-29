package com.jgbemu.core.memory;

interface IMemory {
	byte readAddress(short address);
	void writeAddress(short address, byte data);
	byte[] getRamStack();
}
