package org.ncsp.oop.flexibale_rectangle;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        double result1 = r1.getArea();
        Rectangle r2 = new Rectangle(5);
        double result2 = r2.getArea();
        Rectangle r3 = new Rectangle(2, 3);
        double result3 = r3.getPerimeter();
        System.out.println("Rect 1 Area: " + result1);
        System.out.println("Rect 2 Area: " + result2);
        System.out.println("Rect 3 Area: " + result3);
    }

}
