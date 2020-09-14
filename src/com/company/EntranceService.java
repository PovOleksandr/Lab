package com.company;

final public class EntranceService {
    public void tryToEnter(Student student, Watchman watchman){
        if( student.getIsInside()){
            System.out.println(student+" is already inside the dorm!");

        }else if( student.getRoomNumber() != 0){
            System.out.println(student+" entered the dorm for free!");
            student.enterDorm();

        }else if( student.getCash() >= watchman.getBribeNeeded()){
            System.out.println(student+" entered the dorm with bribe!");
            student.enterDorm();
            student.setCash( -watchman.getBribeNeeded() );
            watchman.setCash( watchman.getBribeNeeded() );

        }else{
            System.out.println(student+" is unable to enter the dorm!");
        }
    }
}
