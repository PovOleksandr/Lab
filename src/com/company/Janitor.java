package com.company;

final public class Janitor extends Person{
    int cleaningQuality;

    Janitor( String name, String surname, int cash, int salary, int cleaningQuality){
        super( name, surname, cash, salary);
        this.cleaningQuality = cleaningQuality;
    }

    int getCleaningQuality(){
        return this.cleaningQuality;
    }
}
