package com.yh.design.proxypattern;

import com.sun.org.apache.regexp.internal.RE;

public class PersonBeanImpl implements  PersonBean {

    String name;
    String gendewr;
    String interests;
    int rating;
    int ratingCount=0;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gendewr;
    }

    @Override
    public String getInterests() {
       return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if(ratingCount==0){return 0;}
        return rating/ratingCount;
    }

    @Override
    public void setName(String name) {
this.name=name;
    }

    @Override
    public void setGender(String gender) {
this.gendewr=gender;
    }

    @Override
    public void setInterests(String interests) {
this.interests=interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
this.rating= rating;
ratingCount++;
    }
}
