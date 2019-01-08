package com.yh.design.designInexample.Framework.FirstExample.Price;


import com.yh.design.designInexample.Framework.FirstExample.MovieV1;

public class ChildrensPrice extends Price {
    @Override
    public  int getPriceCode() {
        return MovieV1.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented) {
        double result=1.5;
        if(daysRented>3){
            result+=(daysRented-3)*1.5;
        }
        return result;
    }
}
