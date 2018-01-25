package com.jgbemu.core.memory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class ROM implements Memory{
	private byte[][] romBanks;
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

	public static byte[][] getBytesFromFile(File file) throws IOException {
		InputStream is = new FileInputStream(file);
		long length = file.length();

		int bankSize = 128*128;
		int numberOfBanks = (int) (length/bankSize);

		// Create the byte array to hold the data
		byte[][] temp = new byte[numberOfBanks][bankSize];

		// Read in the bytes
		for (int i = 0; i < numberOfBanks; i++) {

            System.out.println("Bank: " + i);
            int offset = i*bankSize;
            int numRead = 0;
            byte[] tempBank = new byte[bankSize];
            while (offset < (tempBank.length+offset) && (numRead = is.read(tempBank, (offset-1), tempBank.length)) >= 0) {
                offset += numRead;
            }

            // Ensure all the bytes have been read in
            if (offset < temp.length) {
                throw new IOException("Could not completely read file "+file.getName());
            }



            temp[i] = tempBank;
        }

		is.close();
		return temp;
	}

	public void switchBank(byte bank) {

	}
}
