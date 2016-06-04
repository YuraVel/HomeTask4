package com.goit.online.mod4.ex1;

/**
 * Created by pc on 04.06.2016.
 */
public class Triangle implements Figure{
    public int a;
    public int b;
    public int c;
    Triangle(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;

    }


    @Override
    public double calcArea() {
        int p=(a+b+c)/2;
        double result=  Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return result;
    }
}
