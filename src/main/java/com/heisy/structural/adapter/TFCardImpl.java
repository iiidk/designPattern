package com.heisy.structural.adapter;

public class TFCardImpl implements TFCard{


    @Override
    public String readTF() {
        return "read TF card";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TF write : " + msg);
    }
}
