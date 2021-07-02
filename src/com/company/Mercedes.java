package com.company;

public class Mercedes extends Car {
    private String producingCountry;

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public Mercedes(String name, int since, String producingCountry) {
        super(name,since);
        this.producingCountry = producingCountry;

    }

    @Override
    public void print() {
        System.out.println("Название компании: " + getName() + "\nГод основания компании: " + getSince() +
                "\nСтрана производитель: " + getProducingCountry());
        System.out.println();
    }
}
