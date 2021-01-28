package com.company;

public class Mb extends Car{
    private int volume;
    private int mileage;

    public Mb(int volume, int mileage,int year, Country country,Color color) {
        super(year,country, color);
        this.volume = volume;
        this.mileage = mileage;
    }


    public void move(int howMany, String where, int km, int mileage) {
        super.move(howMany, where, km);
        for (int i = 0; i < howMany; i++) {
            System.out.println("he moving  " + km + " to " + where+"\n"+mileage);

        }
    }

    @Override
    public String printInfo() {
        return super.printInfo()+ " volume "+volume+" mileage " + mileage;
    }

    public int getVolume() {
        return volume;
    }

    public int getMileage() {
        return mileage;
    }
}
