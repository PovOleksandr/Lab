package com.company;

import java.util.ArrayList;
import java.util.List;

final public class Dorm {
    private final int dormNumber;
    private int cleanliness;
    private int numOfFreeRooms;
    private final int monthPrice;
    private List<Student> dormStudents;
    public Dorm(int dormNumber,int cleanliness, int numOfRooms, int monthPrice ){
        this.dormNumber = dormNumber;
        this.cleanliness = cleanliness;
        this.numOfFreeRooms = numOfRooms;
        this.monthPrice = monthPrice;
        this.dormStudents = new ArrayList<>();
    }

    public int getCleanliness(){
        return this.cleanliness;
    }

    public void setCleanliness(int value){
        this.cleanliness += value;
    }

    public int getDormNumber(){
        return this.dormNumber;
    }

    public int getMonthPrice(){
        return this.monthPrice;
    }

    public List<Student> getDormStudents(){
        return this.dormStudents;
    }

    public int getNumOfFreeRooms(){
        return this.numOfFreeRooms;
    }

    public void changeRooms(int value){
        this.numOfFreeRooms += value;
    }
}
