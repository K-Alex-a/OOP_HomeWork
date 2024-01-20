package lesson_03;


/**
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee {

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; %d (лет); Среднемесячная заработная плата: %.2f руб.",
                surName, name, age, calculateSalary());
    }

    public Freelancer(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }
}
