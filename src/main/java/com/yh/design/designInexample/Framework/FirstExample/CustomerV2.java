package com.yh.design.designInexample.Framework.FirstExample;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 将switch操作提取单独做一个函数
 */
public class CustomerV2 {
    private String _name;
    private Vector _rentals=new Vector();

    public CustomerV2(String _name) {
        this._name = _name;
    }
    public void addRental(Rental arg){
        _rentals.addElement(arg);
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }
    public String statement(){
        double totalAmount=0;
        int frequentRenterPoints=0;
        Enumeration rentals=_rentals.elements();
        String result="Rental Record for "+get_name()+"\n";
        while(rentals.hasMoreElements()){
            double thisAmount=0;
            Rental each=(Rental)rentals.nextElement();
            //仅仅在此处进行了修改，将switch语句修改为amountfor封装函数
           // thisAmount=amountfor(each);
            //和上面相比，仅仅将方法里的变量名字修改了
            thisAmount=amountforv2(each);
           /* switch (each.get_movie().get_priceCode()){
                case Movie.REGULAR:
                    thisAmount+=2;
                    if(each.get_daysRented()>2){
                        thisAmount+=(each.get_daysRented()-2)*1.5;
                        break;
                    }
                case  Movie.NEW_RELEASE:
                    thisAmount+=each.get_daysRented()*3;
                    break;
                case  Movie.CHILDRENS:
                    thisAmount+=1.5;
                    if(each.get_daysRented()>3){
                        thisAmount+=(each.get_daysRented()-3)*1.5;
                        break;
                    }
            }*/
            frequentRenterPoints ++;
            if((each.get_movie().get_priceCode()==Movie.NEW_RELEASE)&&each.get_daysRented()>1){
                frequentRenterPoints++;
            }
            result+="\t"+each.get_movie().get_title()+"\t"+String.valueOf(thisAmount)+"\n";
            totalAmount+=thisAmount;

        }
        result+="Amount owed is"+String.valueOf(totalAmount)+"\n";
        result+="You earned "+String.valueOf(frequentRenterPoints)+"frequent renter points";
        return result;
    }
    private double amountfor(Rental each){
        double thisAmount=0;
        switch (each.get_movie().get_priceCode()){
            case Movie.REGULAR:
                thisAmount+=2;
                if(each.get_daysRented()>2){
                    thisAmount+=(each.get_daysRented()-2)*1.5;
                    break;
                }
            case  Movie.NEW_RELEASE:
                thisAmount+=each.get_daysRented()*3;
                break;
            case  Movie.CHILDRENS:
                thisAmount+=1.5;
                if(each.get_daysRented()>3){
                    thisAmount+=(each.get_daysRented()-3)*1.5;
                    break;
                }
        }
        return thisAmount;
    }

    /**
     * eah->aRental
     * thisAmount->result
     * @param aRental
     * @return
     */
    private double amountforv2(Rental aRental){
        double result=0;
        switch (aRental.get_movie().get_priceCode()){
            case Movie.REGULAR:
                result+=2;
                if(aRental.get_daysRented()>2){
                    result+=(aRental.get_daysRented()-2)*1.5;
                    break;
                }
            case  Movie.NEW_RELEASE:
                result+=aRental.get_daysRented()*3;
                break;
            case  Movie.CHILDRENS:
                result+=1.5;
                if(aRental.get_daysRented()>3){
                    result+=(aRental.get_daysRented()-3)*1.5;
                    break;
                }
        }
        return result;
    }
}
