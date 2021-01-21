package com.company;
/*
* created by anastasiaakimova
*/
public class BoxOfCandy {

    public volatile int candy;

    public BoxOfCandy(int candy) {
        this.candy = candy;
    }

    public synchronized void getCandy() {
        this.candy -= 1;
    }

    public boolean isEmpty() {
        return this.candy == 0;
    }
}