package com.company;

public abstract class Car implements Printable {
    private String name;
    private int since;

    public Car(String name, int since) {
        this.name = name;
        this.since = since;
    }

    public int getSince() {
        return since;
    }

    public void setSince(int since) {
        this.since = since;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
