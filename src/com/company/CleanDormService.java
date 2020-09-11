package com.company;

public class CleanDormService {
    static void cleanDorm(Janitor janitor, Dorm dorm){
        if( 100 - dorm.getCleanliness() >= janitor.getCleaningQuality()){
            dorm.setCleanliness( janitor.getCleaningQuality() );
            janitor.setCash( janitor.getSalary() );
            System.out.println("Janitor cleaned dorm number "+dorm.getDormNumber());

        }else{
            System.out.println("Dorm number "+dorm.getDormNumber()+" is still clean enough");
        }
    }
}
