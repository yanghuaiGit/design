package com.yh.design.Iterator.combination;

public class MenuTest {
    public static void main(String[] args) {
        MenuComponent pan=new Menu("PAN MENU","Breakfast");
        MenuComponent din=new Menu("DIN MENU","dinfast");
        MenuComponent caf=new Menu("CAF MENU","caffast");
        MenuComponent des=new Menu("DES MENU","desfast");

        MenuComponent allMenus=new Menu("All MENUS","all menus combined");
        allMenus.add(pan);
        allMenus.add(din);
        allMenus.add(caf);
        din.add(new MenuItem("pasta","pasta in din",true,3.89));
        din.add(des);
        des.add(new MenuItem("despasta","pasta in des",true,1.89));

        Waitress waitress=new Waitress(allMenus);
       // waitress.print();
        waitress.printVegetarianMenu();
    }
}
