package com.company;

public class TechicalItem extends GenericItem {
    public short warrantyTime; // гарантийный срок (суток)

    void printAll() {
        System.out.printf("\n ID:%d,Name:%s,price:%5.2f,Category:%s,Warranty Time:%-20s", ID, name, price, category, warrantyTime);
    }
}

