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

    public MemoryMap(String romPath) {
        //this.rom = new ROM(romPath);
        this.videoRAM = new VideoRAM();
        this.externalRAM = new ExternalRAM();
        this.workRAM = new WorkRAM();
        this.oam = new OAM();
        this.ioPorts = new IOPorts();
        this.highRAM = new HighRAM();
        this.interruptEnableRegister = new InterruptEnableRegister();
    }

    public byte readDataFromAddress(short address) {
        if (address >= (short) 0x0000 && address <= (short) 0x3FFF) {
            rom.readAddress(address);
        } else if (address >= (short) 0x4000 && address <= (short) 0x7FFF) {
            rom.readAddress((short) (address ^ 0x4000));
        } else if (address >= (short) 0x8000 && address <= (short) 0x9FFF) {
            videoRAM.readAddress((short) (address ^ 0x8000));
        } else if (address >= (short) 0xA000 && address <= (short) 0xBFFF) {
            externalRAM.readAddress((short) (address ^ 0xA000));
        } else if (address >= (short) 0xC000 && address <= (short) 0xCFFF) {
            workRAM.readAddress((short) (address ^ 0xC000));
        } else if (address >= (short) 0xD000 && address <= (short) 0xDFFF) {
            workRAM.readAddress((short) (address ^ 0xD000));
        } else if (address >= (short) 0xE000 && address <= (short) 0xEFFF) {
            workRAM.readAddress((short) (address ^ 0xE000));
        } else if (address >= (short) 0xF000 && address <= (short) 0xFDFF) {
            workRAM.readAddress((short) (address ^ 0xF000));
        } else if (address >= (short) 0xFE00 && address <= (short) 0xFE9F) {
            oam.readAddress((short) (address ^ 0xFE00));
        } else if (address >= (short) 0xFEA0 && address <= (short) 0xFEFF) {
            System.out.println("not usable");
        } else if (address >= (short) 0xFF00 && address <= (short) 0xFF7F) {
            ioPorts.readAddress((short) (address ^ 0xFF00));
        } else if (address >= (short) 0xFF80 && address <= (short) 0xFFFE) {
            highRAM.readAddress((short) (address ^ 0xFF80));
        } else if (address == (short) 0xFFFF) {
            interruptEnableRegister.readAddress((short) 0xFFFF);
        }

        return 0x00;
    }

    public void writeDataFromAddress(short address, byte data) {
        if (address >= (short) 0x0000 && address <= (short) 0x3FFF) {
            rom.writeAddress(address, data);
        } else if (address >= (short) 0x4000 && address <= (short) 0x7FFF) {
            rom.writeAddress((short) (address ^ 0x4000), data);
        } else if (address >= (short) 0x8000 && address <= (short) 0x9FFF) {
            videoRAM.writeAddress((short) (address ^ 0x8000), data);
        } else if (address >= (short) 0xA000 && address <= (short) 0xBFFF) {
            externalRAM.writeAddress((short) (address ^ 0xA000), data);
        } else if (address >= (short) 0xC000 && address <= (short) 0xCFFF) {
            workRAM.writeAddress((short) (address ^ 0xC000), data);
        } else if (address >= (short) 0xD000 && address <= (short) 0xDFFF) {
            workRAM.writeAddress((short) (address ^ 0xD000), data);
        } else if (address >= (short) 0xE000 && address <= (short) 0xEFFF) {
            workRAM.writeAddress((short) (address ^ 0xE000), data);
        } else if (address >= (short) 0xF000 && address <= (short) 0xFDFF) {
            workRAM.writeAddress((short) (address ^ 0xF000), data);
        } else if (address >= (short) 0xFE00 && address <= (short) 0xFE9F) {
            oam.writeAddress((short) (address ^ 0xFE00), data);
        } else if (address >= (short) 0xFEA0 && address <= (short) 0xFEFF) {
            System.out.println("not usable");
        } else if (address >= (short) 0xFF00 && address <= (short) 0xFF7F) {
            ioPorts.writeAddress((short) (address ^ 0xFF00), data);
        } else if (address >= (short) 0xFF80 && address <= (short) 0xFFFE) {
            highRAM.writeAddress((short) (address ^ 0xFF80), data);
        } else if (address == (short) 0xFFFF) {
            interruptEnableRegister.writeAddress((short) 0xFFFF, data);
        }
        //TODO:
    }
}
