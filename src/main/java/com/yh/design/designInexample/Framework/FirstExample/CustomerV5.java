package com.yh.design.designInexample.Framework.FirstExample;

import java.util.Enumeration;
import java.util.Vector;

/**
 * totalAmount，frequentRenterPoints提取出来
 */
public class CustomerV5 {
    private String _name;
    private Vector _rentals=new Vector();

    public CustomerV5(String _name) {
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
    /*    所有的局部变量都提取出来
        double totalAmount = 0;
        int frequentRenterPoints = 0;*/
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + get_name() + "\n";
        while (rentals.hasMoreElements()) {
            RentalV3 each = (RentalV3) rentals.nextElement();
            //常客积分添加模块修改为此方法 也抽取出来
          //  frequentRenterPoints+=each.getFrequentRenterPoints();
            result += "\t" + each.get_movie().get_title() + "\t" + String.valueOf(each.getCharge()) + "\n";
          //  totalAmount += each.getCharge();

        }
        result += "Amount owed is" + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + "frequent renter points";
        return result;
    }
    //将局部变量totalAmount的获取提取出来，局部变量只在它的范围内
   private double  getTotalCharge(){
        double result=0;
       Enumeration rentals = _rentals.elements();
       while (rentals.hasMoreElements()) {
           RentalV3 each = (RentalV3) rentals.nextElement();
           result+=each.getCharge();
       }
       return result;
    }
    private int  getFrequentRenterPoints(){
        int result=0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            RentalV3 each = (RentalV3) rentals.nextElement();
            result+=each.getFrequentRenterPoints();
        }
        return result;
    }
}
