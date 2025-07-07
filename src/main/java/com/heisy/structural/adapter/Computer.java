package com.heisy.structural.adapter;

//只接受SD卡的電腦
public class Computer {
    public String readSD(SDCard sdCard){
        return sdCard.readSD();
    }
    public void writeSD(SDCard sdCard, String msg){
        sdCard.writeSD(msg);
    }

}
