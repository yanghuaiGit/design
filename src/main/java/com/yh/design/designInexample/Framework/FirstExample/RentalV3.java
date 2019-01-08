package com.yh.design.designInexample.Framework.FirstExample;

/**
 * 将常客积分模块方法添加到这儿
 */
public class RentalV3 {

    private Movie _movie;
    private int _daysRented;

    public RentalV3(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public Movie get_movie() {
        return _movie;
    }

    public void set_movie(Movie _movie) {
        this._movie = _movie;
    }

    public int get_daysRented() {
        return _daysRented;
    }
    double getCharge(){
        double result=0;
        switch (get_movie().get_priceCode()){
            case Movie.REGULAR:
                result+=2;
                if(get_daysRented()>2){
                    result+=(get_daysRented()-2)*1.5;
                    break;
                }
            case  Movie.NEW_RELEASE:
                result+=get_daysRented()*3;
                break;
            case  Movie.CHILDRENS:
                result+=1.5;
                if(get_daysRented()>3){
                    result+=(get_daysRented()-3)*1.5;
                    break;
                }
        }
        return result;

    }

    public void set_daysRented(int _daysRented) {
        this._daysRented = _daysRented;
    }

    public int getFrequentRenterPoints(){
        if ((get_movie().get_priceCode() == Movie.NEW_RELEASE) && get_daysRented() > 1) {
            return 2;
        }
        else{
            return 1;
        }

    }
}
