package com.heisy.structural.adapter;

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "read SD card";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SD write : " + msg);
    }
}
