package com.company;

public class Calculator {

    public static double add(double a,double b){
        return round(a+b);
    }
    public static double sub(double a,double b){
        return round(a-b);
    }
    public static double multiply(double a,double b){
        return round(a*b);
    }
    public static double divide(double a,double b){
        return round(a/b);
    }
    private static double round(double result){
        result*=10000000;
        result=Math.round(result);
        result/=10000000;
        return result;
    }
}
