package org.ncsp.oop.flexibale_rectangle;

public class Rectangle {

    private double width;
    private double height;


    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }
    public Rectangle(double side){
        this.width = side;
        this.height = side;
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.width = height;
    }

    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return this.width + this.height + this.width + this.height;
    }

}
