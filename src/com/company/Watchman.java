package com.company;

final public class Watchman extends Person{
    private final int bribeNeeded;

    public Watchman(String name, String surname, int cash, int bribeNeeded, int salary){
        super(name, surname, cash, salary);
        this.bribeNeeded = bribeNeeded;
    }

    public int getBribeNeeded(){
        return this.bribeNeeded;
    }
}
