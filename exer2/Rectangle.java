/*
 * @ (#) Rectangle.java      1.0     8/26/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */
 
package edu.iuh.fit.exer2;
/*
 * @description: This is a sample code header.
 * @author: Thai, Tran Quoc
 * @version: 1.0
 * @created: 21-Aug-2024 8:12:21 AM
 */

import java.util.IllformedLocaleException;


public class Rectangle {
    private double lenght;
    private double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
        if (lenght < 0 || width < 0)
            throw new IllformedLocaleException("Lenght must be greater than 0");
    }
    /**
     * Get the lenght of the rectangle
     * @return the lenght of the rectangle
     */
    public double getLenght() {
        return lenght;
    }
    /**
     * Set the lenght of the rectangle
     * @param lenght
     * @throws IllformedLocaleException if lenght is less than 0
     */
    public void setLenght(double lenght) {
        if (lenght < 0)
            throw new IllformedLocaleException("Lenght must be greater than 0");

        this.lenght = lenght;
    }
    /**
     * Get the width of the rectangle
     * @return the width of the rectangle
     */
    public double getWidth() {
        return width;
    }
    /**
     * Set the width of the rectangle
     * @param width
     * @throws IllformedLocaleException if width is less than 0
     */
    public void setWidth(double width) {
        if (width < 0)
            throw new IllformedLocaleException("Width must be greater than 0");
        this.width = width;
    }
    public void getArea() {
        System.out.println("Area: " + lenght * width);
    }
    public void getPerimeter() {
        System.out.println("Perimeter: " + 2 * (lenght + width));
    }

}