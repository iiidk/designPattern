package com.heisy.structural.adapter;

public class AdapterTF2SDobject implements SDCard {
    private TFCard tfCard;

    public AdapterTF2SDobject(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}
