package com.company;

import java.util.Date;

public class FoodItem extends GenericItem {
    public Date dateOfIncome; // дата производства
    public short expires; // срок годности
    private String analog;

    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , Category:%s , Expires:%d , Date:%tD%n", ID, name, price, category, expires, dateOfIncome );
    }

    public FoodItem(String n, float p, String a, Date d, short e) {
        name = n;
        price = p;
        analog = a;
        dateOfIncome = d;
        expires = e;
    }

    public FoodItem(String n, float p, short e) {
        name = n;
        price = p;
        expires = e;
    }

    public FoodItem(String n) {
        name = n;
    }

    public FoodItem(){

    }
}

