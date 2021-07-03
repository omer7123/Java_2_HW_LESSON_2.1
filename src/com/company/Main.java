package com.company;

public class Main {

    public static String className;

    public static void main(String[] args) {
        Car[] car = {createObject("Porsche"), createObject("Mercedes"),createObject("Tesla")};
        for (int i = 0; i < car.length; i++) {
            car[i].print();
        }
    }

    public static Car createObject(String className) {
        switch (className) {
            case ("Porsche"):
                Porsche porsche = new Porsche("Porshe", 1931, 911);
                return porsche;
            case ("Mercedes"):
                Mercedes mercedes = new Mercedes("mercedes", 1926, "German");
                return mercedes;
            case ("Tesla"):
                Tesla tesla = new Tesla("Tesla", 2003, 100);
                return tesla;
        }

        return null;

    }
}
