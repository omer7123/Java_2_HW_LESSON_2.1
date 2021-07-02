package com.company;

public class Porsche extends Car {
    private int model;

    public Porsche(String name, int since, int model) {
        super(name, since);
        this.model = model;

    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Название компании: " + getName() + "\nГод основания компании: " + getSince() +
                "\nМодель автомобиля : " + getModel());

        System.out.println();
    }
}
