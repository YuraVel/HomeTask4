package com.goit.online.mod4.ex2;

/**
 * Created by pc on 04.06.2016.
 */
public class CelsiumToFahrenheit {
    public double toFarhrenheit(int t){
        int result=9/5*t+32;
        return result;
    }
    public double toCelsium(int t){
        int result=5/9*(t-32);
        return result;
    }
}
