package com.company;

public class InOutService {
    public void moveIn(Dorm dorm, Student student){
        if (dorm.getNumOfFreeRooms() > 0) {
            dorm.getDormStudents().add(student);
            dorm.changeRooms(-1);
            System.out.println(student + "moved in the dorm number " + dorm.getDormNumber());

        }else{
            System.out.println("There are no free rooms in this dorm!");
        }
    }

    public void kickOut(Dorm dorm, Student student){
        dorm.getDormStudents().remove(student);
        dorm.changeRooms(1);
        student.setRoomNumber(0);
        System.out.println(student+" got kicked from the dorm.");
    }
}
