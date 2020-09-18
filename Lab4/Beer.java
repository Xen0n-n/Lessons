package com.company;

public class Beer implements Priceable{
    private String name;
    private int price;

    Beer(String name, int price){
        this.name=name;
        this.price=price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void ShowPrice() {
        System.out.println(name +" "+ "Prise is "+ price + " ");
    }
}
