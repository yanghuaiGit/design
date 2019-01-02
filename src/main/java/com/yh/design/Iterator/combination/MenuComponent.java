package com.yh.design.Iterator.combination;

import org.springframework.util.CompositeIterator;

import java.util.Iterator;

public abstract class MenuComponent {
    /**
     * 组合方法组织在一起 也就是给组合进行操作
     * @param menuComponent
     */
    public void add(MenuComponent menuComponent){throw new UnsupportedOperationException();}
    public void remove(MenuComponent menuComponent){throw new UnsupportedOperationException();}
    public MenuComponent getChild(int i){throw new UnsupportedOperationException();}

    /**
     * 这些是操作方法，是给菜单项进行操作也就是组件进行操作
     * @return
     */
    public String getName(){throw new UnsupportedOperationException();}
    public String getDescription(){throw new UnsupportedOperationException();}
    public double getPrice(){throw new UnsupportedOperationException();}
    public boolean isVegetarian(){throw new UnsupportedOperationException();}
    public void print(){throw new UnsupportedOperationException();}

    /**
     * 迭代器和组合模式
     * @return
     */
    public Iterator createiterator(){throw new UnsupportedOperationException();}
}
