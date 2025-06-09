package com.heisy.creational.prototype;

public class Shop implements Cloneable{
    private int id;
    private Person shopkeeper;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getShopkeeper() {
        return shopkeeper;
    }

    public void setShopkeeper(Person shopkeeper) {
        this.shopkeeper = shopkeeper;
    }

    public Shop() {
    }

    public Shop(int id, Person shopkeeper) {
        this.id = id;
        this.shopkeeper = shopkeeper;
    }


    @Override
    protected Shop clone() throws CloneNotSupportedException {
        Shop shop = (Shop)super.clone();
        shop.shopkeeper = this.shopkeeper.clone();
        return shop;

    }
}
