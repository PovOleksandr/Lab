package com.company;

import java.util.ArrayList;
import java.util.List;

final public class PayingService {
    private final CashDesk cashDesk;

    public PayingService(CashDesk cashDesk){
        this.cashDesk = cashDesk;
    }

    public void payingForDorm(Dorm dorm){
        List<Student> toKick = new ArrayList<>();
        InOutService ioServ = new InOutService();

        for ( Student student: dorm.getDormStudents()){
            if(student.getCash() >= dorm.getMonthPrice() * dorm.getCleanliness() / 100){
                student.setCash( -dorm.getMonthPrice() * dorm.getCleanliness() / 100);
                cashDesk.setIncome( dorm.getMonthPrice() * dorm.getCleanliness() / 100 );
                System.out.println(student+" payed for this month.");

            }else{
                toKick.add(student);
            }
        }

        for (Student student: toKick){
            ioServ.kickOut(dorm, student);
        }
    }
}
