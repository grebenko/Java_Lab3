package com.company;

public class GenericItem {
    public int ID; // ID товара
    public String name; // Наименование товара
    public float price; // Цена товара
    private String analog;
    public enum Category {
        FOOD,
        PRINT,
        DRESS,
        GENERAL
    }
    public GenericItem.Category category;
    static int currentID=0;

    public GenericItem() {
        this.ID = GenericItem.currentID++;
    }

    public GenericItem(String n, float p, Category c) {
        name = n;
        price = p;
        category = c;
        this.ID = GenericItem.currentID++;
    }

    public GenericItem(String n, float p, String a) {
        name = n;
        price = p;
        analog = a;
        this.ID = GenericItem.currentID++;
    }

    void printAll(){
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , Category:%s \n",ID,name,price,category);
    }
}
