package com.company;

public  class Transpost {
    private Color color;

    public Transpost(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    public String printInfo(){
        return "color "+color;
    }
}
