package com.yh.design.designInexample.Framework.FirstExample;

public class RentalV4 {

    private MovieV1 _movie;
    private int _daysRented;

    public RentalV4(MovieV1 _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public MovieV1 get_movie() {
        return _movie;
    }

    public void set_movie(MovieV1 _movie) {
        this._movie = _movie;
    }

    public int get_daysRented() {
        return _daysRented;
    }
    double getCharge(){
      /*  double result=0;
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
        return result;*/
        return _movie.getcharge(_daysRented);

    }

    public void set_daysRented(int _daysRented) {
        this._daysRented = _daysRented;
    }

    public int getFrequentRenterPoints(){
       return _movie.getFrequentRenterPoints(_daysRented);

    }
}
