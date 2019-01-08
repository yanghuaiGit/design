package com.yh.design.designInexample.Framework.FirstExample.Price;

import com.yh.design.designInexample.Framework.FirstExample.MovieV1;

public class RegularPrice extends Price {
    @Override
    public int getPriceCode() {
        return MovieV1.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        double result=2;
        if(daysRented>2){
            result+=(daysRented-2)*1.5;
        }
        return result;
    }
}
