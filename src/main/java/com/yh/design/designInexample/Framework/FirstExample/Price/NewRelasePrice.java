package com.yh.design.designInexample.Framework.FirstExample.Price;


import com.yh.design.designInexample.Framework.FirstExample.MovieV1;

public class NewRelasePrice extends  Price {
    @Override
    public int getPriceCode() {
        return MovieV1.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented*3;
    }

    /**
     * 仅仅是在new类中复写这个方法
     * @param daysRented
     * @return
     */
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented>1)?2:1;
    }
}
