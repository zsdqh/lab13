package org.example;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome Евгений!");
        Tester tester = new Tester("Ivan", "Ivanov", 2000.0, 'B');

        Date month = new Date(2020, Calendar.FEBRUARY, 11);
        double monthlyIncome = Tester.calcMonthlyIncome(3000.0, month);
        System.out.println("Ежемесячный доход (статический): " + monthlyIncome);

        double monthlyIncomeInstance = tester.calcMonthlyIncome(month);
        System.out.println("Ежемесячный доход (экземпляр, только зарплата): " + monthlyIncomeInstance);

        double monthlyIncomeInstanceNow = tester.calcMonthlyIncome();
        System.out.println("Ежемесячный доход (экземпляр): " + monthlyIncomeInstanceNow);


    }
}