package com.company;

public class Main {

    public static void main(String[] args) {
        Beer Redds = new Beer("Redds", 75);
        Beer Miller = new Beer("Miller", 55);
        Redds.ShowPrice();
        Miller.ShowPrice();
        System.out.println(Miller.getPrice());
    }
}
