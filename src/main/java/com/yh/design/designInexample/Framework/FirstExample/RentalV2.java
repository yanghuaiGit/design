package com.yh.design.designInexample.Framework.FirstExample;

/**
 * 将switch的计算方法放到此类中去
 */
public class RentalV2 {
    private Movie _movie;
    private int _daysRented;

    public RentalV2(Movie _movie, int _daysRented) {
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
}
