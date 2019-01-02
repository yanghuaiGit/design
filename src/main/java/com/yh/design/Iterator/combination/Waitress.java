package com.yh.design.Iterator.combination;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;
    public Waitress(MenuComponent allMenus){
        this.allMenus=allMenus;
    }
    public void print(){
        allMenus.print();
    }
    public void printVegetarianMenu(){
        Iterator iterator=allMenus.createiterator();
        System.out.println("\n VEGETARIAN MENU \n----");
        while(iterator.hasNext()){
            MenuComponent menuComponent=(MenuComponent)iterator.next();
            /**
             * 只有菜单项才能输出，菜单不能输出
             */
           try{
               if(menuComponent.isVegetarian()){
                   menuComponent.print();
               }
           }catch (UnsupportedOperationException e){
           }
        }
    }
}
