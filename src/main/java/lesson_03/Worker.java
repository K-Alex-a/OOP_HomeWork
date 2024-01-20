package lesson_03;

/**
 * Рабочий (работает с 9 до 18),
 * получает фиксированную заработную плату
 */
public class Worker extends Employee {

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; %d (лет); Среднемесячная заработная плата: %.2f руб.",
                surName, name, age, calculateSalary());
    }

    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }
}
