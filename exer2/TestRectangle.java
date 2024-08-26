package edu.iuh.fit.exer2;


public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(20, 4);

        System.out.println("Lenght: " + r1.getLenght());
        System.out.println("Width: " + r1.getWidth());
        r1.getArea();
    }
}
