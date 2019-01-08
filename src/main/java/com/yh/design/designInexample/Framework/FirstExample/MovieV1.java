package com.yh.design.designInexample.Framework.FirstExample;

import com.yh.design.designInexample.Framework.FirstExample.Price.ChildrensPrice;
import com.yh.design.designInexample.Framework.FirstExample.Price.NewRelasePrice;
import com.yh.design.designInexample.Framework.FirstExample.Price.Price;
import com.yh.design.designInexample.Framework.FirstExample.Price.RegularPrice;

import java.text.BreakIterator;

public class MovieV1 {
    public static  final  int CHILDRENS=2;
    public static  final  int REGULAR=0;
    public static final int NEW_RELEASE=1;

    private String _title;
    //private int _priceCode;
    private Price _price;

    public MovieV1(String _title, int _priceCode) {
        this._title = _title;
       // this._priceCode = _priceCode;
        //确保任何时候都通过取值函数和设置函数来访问类型代码
       set_priceCode(_priceCode);
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public int get_priceCode() {
        return _price.getPriceCode();
    }

    public void set_priceCode(int arg) {
        //个人认为加一个工厂模式是最好的
        switch (arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;

            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                _price = new NewRelasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    public double getcharge(int daysRented ){
        return _price.getCharge(daysRented);
         /*double result=0;
       switch (get_priceCode()){
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
        return result;*/
    }
    public int getFrequentRenterPoints(int daysRented){
        return _price.getFrequentRenterPoints(daysRented);
       /* if((get_priceCode()==MovieV1.NEW_RELEASE)&&daysRented>1){
             return 2;
        }else{
            return 1;
        }*/
    }
}
