package com.company;

public class Person {
    private final String name;
    private final String surname;
    private int cash;
    private int salary;

    public Person( String name, String surname, int cash, int salary){
        this.name = name;
        this.surname = surname;
        this.cash = cash;
        this.salary = salary;
    }

    public void monthSalary(){
        System.out.println(this.name+this.surname+" got its salary!");
        this.cash += this.salary;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public int getCash(){
        return this.cash;
    }

    public void setCash(int amount){
        this.cash += amount;
    }

    public int getSalary(){
        return this.salary;
    }

}
