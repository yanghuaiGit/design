package com.yh.design.TemplateMethod.V1;

public class coffee extends  CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("starting brew coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("starting addCondiments coffee");
    }

    /**coffee没被调用，就绝对不会调用高层组件的prepareRecipe方法。
     *
     * @param args
     */
    public static void main(String[] args) {
        CaffeineBeverage caffeineBeverage= new  coffee();
        caffeineBeverage.prepareRecipe();
    }

}
