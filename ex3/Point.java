package com.goit.online.mod4.ex3;

/**
 * Created by pc on 04.06.2016.
 */
public class Point {
    public int x,y;



    public double calcDistance(Point p1,Point p2){


       double result=Math.sqrt(Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2));
        return result;
    }
}
