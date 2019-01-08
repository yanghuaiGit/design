package com.yh.design.designInexample.Framework.FirstExample;

import java.util.Enumeration;
import java.util.Vector;

/**
 * //将获取价格方法放入到Rental中去
 * 此时thisAmount没什么作用了 仅仅是接收返回的结果，因此直接把each.getCharge()放入thisamount地方就可以了
 * 这样会导致each.getCharge()方法被调用两次，但是可以优化这个方法 在后续重构与性能有优化
 */
public class CustomerV3 {
    private String _name;
    private Vector _rentals=new Vector();

    public CustomerV3(String _name) {
        this._name = _name;
    }
    public void addRental(RentalV2 arg){
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
            RentalV2 each = (RentalV2) rentals.nextElement();


           // ========常客积分添加模块=================
            frequentRenterPoints++;
            if ((each.get_movie().get_priceCode() == Movie.NEW_RELEASE) && each.get_daysRented() > 1) {
                frequentRenterPoints++;
            }
            //============常客积分添加模块结束===========
            result += "\t" + each.get_movie().get_title() + "\t" + String.valueOf(each.getCharge()) + "\n";
            totalAmount += each.getCharge();

        }
        result += "Amount owed is" + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + "frequent renter points";
        return result;
    }

}
