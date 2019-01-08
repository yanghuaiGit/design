package com.yh.design.designInexample.Framework.FirstExample;

import java.util.Enumeration;
import java.util.Vector;

public class CustomerV4 {
    private String _name;
    private Vector _rentals=new Vector();

    public CustomerV4(String _name) {
        this._name = _name;
    }
    public void addRental(RentalV3 arg){
        _rentals.addElement(arg);
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + get_name() + "\n";
        while (rentals.hasMoreElements()) {
            //  double thisAmount = 0;
            RentalV3 each = (RentalV3) rentals.nextElement();
             //常客积分添加模块修改为此方法
            frequentRenterPoints+=each.getFrequentRenterPoints();
          /*  // ========常客积分添加模块=================
            frequentRenterPoints++;
            if ((each.get_movie().get_priceCode() == Movie.NEW_RELEASE) && each.get_daysRented() > 1) {
                frequentRenterPoints++;
            }
            //============常客积分添加模块结束===========*/
            result += "\t" + each.get_movie().get_title() + "\t" + String.valueOf(each.getCharge()) + "\n";
            totalAmount += each.getCharge();

        }
        result += "Amount owed is" + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + "frequent renter points";
        return result;
    }
}
