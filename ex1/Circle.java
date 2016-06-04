package com.goit.online.mod4.ex1;

/**
 * Created by pc on 04.06.2016.
 */
public class Circle implements Figure {
    int radius;

    Circle(int radius){
        this.radius=radius;
    }
    @Override
    public double calcArea() {
        double result=Math.PI*Math.pow(radius,2);
        return result;
    }
}
