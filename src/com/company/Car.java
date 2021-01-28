package com.company;

public class Car extends Transpost {
    private int year;
    private Country country;

    public Country getCountry() {
        return country;
    }

    public Car(int year, Country country, Color color) {
        super(color);
        this.year = year;
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void move(int km, int howMany, String where) {
        for (int i = 0; i < howMany; i++) {
            System.out.println("he moving  " + km + " to " + where);

        }
    }

    public void move(int howMany, String where, int km) {
        for (int i = 0; i < howMany; i++) {
            System.out.println("he moving  " + km + " to " + where);
        }
    }

    final void move(String where, int howMany, int km) {
        for (int i = 0; i < howMany; i++) {
            System.out.println("he moving  " + km + " to " + where);
        }
    }

    @Override
    public String printInfo() {
        return super.printInfo()+ " year " + year+ " country " + country.getName()+ " type " +country.getType();
    }
}



