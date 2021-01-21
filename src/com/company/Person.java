package com.company;
/*
 * created by anastasiaakimova
 */
public class Person extends Thread {
    String name;
    BoxOfCandy boxOfCandy;
    private int sum = 0;

    public Person(String name, BoxOfCandy boxOfCandy) {
        this.boxOfCandy = boxOfCandy;
        this.name = name;
    }

    @Override
    public void run() {
        // пока коробка не пуста
        while (this.boxOfCandy.candy > 0) {
            synchronized (this.boxOfCandy) {
                if (this.boxOfCandy.candy > 0) {
                    this.boxOfCandy.getCandy();
                    this.sum++;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public int getSum() {
        return sum;
    }
}