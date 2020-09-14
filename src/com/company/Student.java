package com.company;

final public class Student extends Person{

    private int roomNumber;
    private boolean isInsideDorm;
    public Student( String name, String surname, int cash, int salary, int roomNumber){
        super( name, surname, cash, salary);
        this.roomNumber = roomNumber;
        this.isInsideDorm = false;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public boolean getIsInside(){
        return this.isInsideDorm;
    }

    public void enterDorm(){
        this.isInsideDorm = true;
    }

    public void setRoomNumber(int value){
        this.roomNumber = value;
    }

    public void leaveDorm(){
        System.out.println(this.getName()+this.getSurname()+" has left dorm!");
        this.isInsideDorm = false;
    }

    @Override
    public String toString() {
        return super.getName() +" "+ super.getSurname() ;
    }
}
