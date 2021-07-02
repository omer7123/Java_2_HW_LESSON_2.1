package com.company;

public class Tesla extends Car{
    private int potreblenie;

    public Tesla(String name, int since,int potreblenie) {
        super(name, since);
        this.potreblenie = potreblenie;
    }

    public int getPotreblenie() {
        return potreblenie;
    }

    public void setPotreblenie(int potreblenie) {
        this.potreblenie = potreblenie;
    }


    @Override
    public void print() {
        System.out.println("Название компании: " + getName() + "\nГод основания компании: " + getSince() +
                "\nПотребление электроэнернии: " + getPotreblenie() + " кВт * ч");
        System.out.println();
    }
}
