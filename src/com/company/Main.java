package com.company;

public class Main {

    public static void main(String[] args) {
        Country country1 = new Country("Germany", "седан");
        Car objectA = new Car(2013, country1, Color.BLACK);
        System.out.println(objectA.printInfo());
        objectA.move(20, 5, "Bishkek");

        Country country2 = new Country("Japan", "седан");
        Mb objectB = new Mb(5, 1000, 2010, country1, Color.WHITE);
        System.out.println(objectB.printInfo());
        objectB.move(240, 2, "Moscow");

        Country country3 = new Country("China", "седан");
        Mb objectC = new Mb(2, 800, 2000, country1, Color.BROWN);
        System.out.println(objectC.printInfo());
        objectC.move(205, 1, "Pekin");


    }
}
