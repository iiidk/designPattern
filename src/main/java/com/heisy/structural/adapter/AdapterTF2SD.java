package com.heisy.structural.adapter;

/**
 * 類適配器
 */
public class AdapterTF2SD extends TFCardImpl implements SDCard {
    //内部實現偷梁換柱
    @Override
    public String readSD() {
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        writeTF(msg);
    }
}
