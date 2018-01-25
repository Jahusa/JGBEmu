package com.jgbemu.core.memory;

public class InterruptEnableRegister implements Memory {
    byte interruptEnableRegister;

    public InterruptEnableRegister() {

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
