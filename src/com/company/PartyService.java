package com.company;

final public class PartyService {
    static void party(Dorm dorm){
        System.out.println("There is a party in a dorm number "+dorm.getDormNumber());
        dorm.setCleanliness(-30);
    }
}
