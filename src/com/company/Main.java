package com.company;

public class Main {

    public static String className;

    public static void main(String[] args) {
        createObject("Porsche").print();
        createObject("Mercedes").print();
        createObject("Tesla").print();

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
