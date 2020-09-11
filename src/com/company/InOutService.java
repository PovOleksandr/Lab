package com.company;

public class InOutService {
    public static void moveIn(Dorm dorm, Student student){
        dorm.getDormStudents().add(student);
        System.out.println(student+"moved in the dorm number "+dorm.getDormNumber());
    }

    public static void kickOut(Dorm dorm, Student student){
        dorm.getDormStudents().remove(student);
        student.setRoomNumber(0);
        System.out.println(student+" got kicked from the dorm.");
    }
}
