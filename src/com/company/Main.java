package com.company;

public class Main {

    public static void main(String[] args) {
        Dorm dorm1 = new Dorm(1,100,20,700);
        Dorm dorm2 = new Dorm(2,75,30,550);
        Dorm dorm3 = new Dorm(3,60,35,400);

        Watchman watchman = new Watchman( "Galina", "Martynenko", 3000, 100, 1500);
        Janitor janitor = new Janitor( "Viktor", "Paltsev", 2000, 2000, 30);

        Student stud1 = new Student("Aleksandr", "Povidzion", 400, 1000, 0);
        Student stud2 = new Student( "Anna", "Sushkina", 1350, 500, 1);
        Student stud3 = new Student( "Oleg", "Popov", 400, 600, 10);
        Student stud4 = new Student( "Oleg", "Panchenko", 400, 100, 5);

        CashDesk cashDesk = new CashDesk();
        PayingService payingService = new PayingService(cashDesk);

        InOutService ioServ = new InOutService();
        CleanDormService clDormServ = new CleanDormService();
        PartyService ptyServ = new PartyService();
        EntranceService entServ = new EntranceService();

        ioServ.moveIn(dorm1,stud2);
        ioServ.moveIn(dorm1,stud3);
        ioServ.moveIn(dorm1,stud4);

        clDormServ.cleanDorm(janitor,dorm1);
        clDormServ.cleanDorm(janitor,dorm3);

        ptyServ.party(dorm2);

        entServ.tryToEnter(stud1, watchman);
        entServ.tryToEnter(stud2, watchman);
        stud2.leaveDorm();
        entServ.tryToEnter(stud2, watchman);

        stud1.monthSalary();
        stud2.monthSalary();
        stud3.monthSalary();
        stud4.monthSalary();

        payingService.payingForDorm(dorm1);
        payingService.payingForDorm(dorm2);
        payingService.payingForDorm(dorm3);
    }
}
