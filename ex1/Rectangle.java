package com.goit.online.mod4.ex1;

/**
 * Created by pc on 04.06.2016.
 */
public class Rectangle implements Figure {
    int a;
    int b;

    Rectangle(int a, int b){
        this.a=a;
        this.b=b;

    }

    @Override
    public double calcArea() {
        int result=a*b;
        return result;
    }
}
