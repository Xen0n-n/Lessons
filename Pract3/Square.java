package com.company;

public class Square extends Rectangle {
    public Square(){}
    public Square(double side){
        this.width=side;
        this.length=side;
    }

    public Square(double side, String color, boolean filled){
        this.width=side;
        this.length=side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        this.length = side;
        this.width = side;
    };

    public void setLength(double side) {
        super.setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
