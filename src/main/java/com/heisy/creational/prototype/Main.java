package com.heisy.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        Person cloned = p1.clone();
        p1.setName("heisy");
        cloned.setName("dango");
        System.out.println(p1.toString());
        System.out.println(cloned.toString());
        System.out.println(p1.getName() + " " + cloned.getName());

        Shop shop1 = new Shop(1,p1);
        Shop clone = shop1.clone();
        clone.getShopkeeper().setName("buh");
        //浅克隆输出"buh",clone\shop1的shopkeeper指向同一对象
        //深克隆两个对象指向不同,输出heisy
        System.out.println(shop1.getShopkeeper().getName());

    }
}
