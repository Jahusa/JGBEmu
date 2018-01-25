package com.jgbemu.core.memory;

public class MemoryMap {
    private ROM rom;
    private VideoRAM videoRAM;
    private ExternalRAM externalRAM;
    private WorkRAM workRAM;
    private OAM oam;
    private IOPorts ioPorts;
    private HighRAM highRAM;
    private InterruptEnableRegister interruptEnableRegister;

    public MemoryMap() {
        rom = new ROM("");
        videoRAM = new VideoRAM();

    }

    public byte getDataFromAddress(short address) {
        if (address >= (short) 0x0000 && address <= (short) 0x4FFF) {
            System.out.println("rom data bank 0");
        } else if (address >= (short) 0x4000 && address <= (short) 0x9FFF) {
            System.out.println("vram data bank an");
        } else if (address >= (short) 0x8000 && address <= (short) 0x9FFF) {
            System.out.println("vram data");
        } else if (address >= (short) 0xA000 && address <= (short) 0xBFFF) {
            System.out.println("external data");
        } else if (address >= (short) 0xC000 && address <= (short) 0xCFFF) {
            System.out.println("work ram");
        } else if (address >= (short) 0xD000 && address <= (short) 0xDFFF) {
            System.out.println("echo work data");
        } else if (address >= (short) 0xE000 && address <= (short) 0xFDFF) {
            System.out.println("oam data");
        } else if (address >= (short) 0xFE00 && address <= (short) 0xFE9F) {
            System.out.println("rom data");
        } else if (address >= (short) 0xFEA0 && address <= (short) 0xFEFF) {
            System.out.println("not usable");
        } else if (address >= (short) 0xFF00 && address <= (short) 0xFF7F) {
            System.out.println("io ports");
        } else if (address >= (short) 0xFF80 && address <= (short) 0xFFFE) {
            System.out.println("hram");
        } else if (address == (short) 0xFFFF) {
            System.out.println("interrupt enable");
        }

        return 0x00;
    }

    public void setDataFromAddress(short address, byte data) {
        //TODO:
    }
}
