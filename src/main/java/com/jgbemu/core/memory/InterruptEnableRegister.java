package com.jgbemu.core.memory;

public class InterruptEnableRegister implements IMemory {
    private byte interruptEnableRegister;

    public InterruptEnableRegister() {
        interruptEnableRegister = 0x00;
    }

    @Override
    public byte readAddress(short address) {
        return interruptEnableRegister;
    }

    @Override
    public void writeAddress(short address, byte data) {
        interruptEnableRegister = data;
    }

    @Override
    public byte[] getRamStack() {
        return new byte[]{interruptEnableRegister};
    }
}
