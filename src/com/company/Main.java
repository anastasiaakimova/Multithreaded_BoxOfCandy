package com.company;
/*
 * created by anastasiaakimova
 */
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int candy = 50;
        ArrayList<Person> threadsTmp = new ArrayList<>();
        BoxOfCandy boxOfCandy = new BoxOfCandy(candy);

        threadsTmp.add(new Person("Misha", boxOfCandy));
        threadsTmp.add(new Person("Sasha", boxOfCandy));
        threadsTmp.add(new Person("Pasha", boxOfCandy));

        for (Person person : threadsTmp) {
            person.start();
        }

        for (Person thread : threadsTmp) {
            thread.join();
        }

        for (Person person : threadsTmp) {
            System.out.println(person.getSum() + " - " + person.name);
        }


    }
}