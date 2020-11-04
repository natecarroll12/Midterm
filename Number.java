package com.company;

public class Number {
    public static double number(int x) {
        if(x == 1) {
            return 1;
        } else
        {
            return (1/x) + number(x - 1);
        }
    }
}
