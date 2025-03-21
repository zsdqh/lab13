package org.example;

import java.time.DateTimeException;
import java.util.Date;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private char englishLevel;
    private double salary;
    private static final int[] months =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Tester(String name, String surname, double salary, char englishLevel)
    {
        this(name, surname);
        this.salary = salary;
        this.englishLevel=englishLevel;
    }

    private Tester(String name, String surname)
    {
        this();
        this.name=name;
        this.surname=surname;
    }

    private Tester()
    {
        this.expirienceInYears=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExpirienceInYears() {
        return expirienceInYears;
    }

    public void setExpirienceInYears(int expirienceInYears) {
        this.expirienceInYears = expirienceInYears;
    }

    public char getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(char englishLevel) {
        this.englishLevel = englishLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static double calcMonthlyIncome(double salary, Date month)
    {
        return salary*months[month.getMonth()];
    }
    public double calcMonthlyIncome(Date month)
    {
        return this.salary*months[month.getMonth()];
    }
    public double calcMonthlyIncome()
    {
        Date now = new Date();
        return this.salary*months[now.getMonth()];
    }

}
