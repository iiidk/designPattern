package com.heisy.structural.adapter;

public class Main {
    public static void main(String[] args) {

        Computer pc = new Computer();
        SDCardImpl sdCard = new SDCardImpl();
        System.out.println(pc.readSD(sdCard));
        pc.writeSD(sdCard, "write to SD");

        AdapterTF2SD tfCard = new AdapterTF2SD();
        System.out.println(pc.readSD(tfCard));
        pc.writeSD(tfCard, "write to adapter");

        AdapterTF2SDobject tf2SD = new AdapterTF2SDobject(new TFCardImpl());
        System.out.println(pc.readSD(tf2SD));
        pc.writeSD(tf2SD, "write to adapter_2");
    }
}
