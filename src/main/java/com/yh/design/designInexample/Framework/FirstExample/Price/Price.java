package com.yh.design.designInexample.Framework.FirstExample.Price;

import com.yh.design.designInexample.Framework.FirstExample.Movie;
import com.yh.design.designInexample.Framework.FirstExample.MovieV1;

public abstract class Price {
     public abstract int getPriceCode();
     public abstract double getCharge(int daysRented);
  /*  public double getCharge(int daysRented){
         double result=0;
       switch (getPriceCode()){
            case Movie.REGULAR:
                result+=2;
                if(daysRented>2){
                    result+=(daysRented-2)*1.5;
                    break;
                }
            case  Movie.NEW_RELEASE:
                result+=daysRented*3;
                break;
            case  Movie.CHILDRENS:
                result+=1.5;
                if(daysRented>3){
                    result+=(daysRented-3)*1.5;
                    break;
                }
        }
        return result;
    }*/
  public int getFrequentRenterPoints(int daysRented){
            return 1;
  }
}
