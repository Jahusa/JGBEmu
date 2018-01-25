package com.jgbemu.core.memory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ROM implements Memory{
	//private byte[] romBank0;
	//private byte[] romBankSwitchable;
	private final short offset = 0x0000;
	private byte[] romBanks;
	private byte[] rom;

	public ROM(String romPath) {
		super();
		try {
			rom = Files.readAllBytes(new File(romPath).toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}

		//TODO: create ROM - Banks
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
		//TODO: ROM-Bank
		return rom;
	}

	public void switchBank(byte bank) {

	}
}
