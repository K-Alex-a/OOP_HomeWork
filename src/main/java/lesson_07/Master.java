package lesson_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Master implements Observer{

    private String name;
    private int salary;
    private List<TypeVacancy> vacancy;


    public Master(String name) {
        this.name = name;
        salary = 80000;
        vacancy = new ArrayList<>();
        vacancy.add(TypeVacancy.Clerk);
        vacancy.add(TypeVacancy.Manager);
        vacancy.add(TypeVacancy.Supervisor);
        vacancy.add(TypeVacancy.Director);
    }

    public List<TypeVacancy> getVacancy() {
        return vacancy;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, TypeVacancy vacancy) {
        for (TypeVacancy type : this.vacancy) {
            if (type.equals(vacancy)) {
                if (this.salary <= salary) {
                    System.out.printf("Специалист (%s): Мне нужна эта работа! (компания: %s; должность: %s; заработная плата: %d)\n",
                            name, nameCompany, vacancy, salary);
                    this.salary = salary;
                } else {
                    System.out.printf("Специалист (%s): Я найду работу получше! (компания: %s; должность: %s; заработная плата: %d)\n",
                            name, nameCompany, vacancy, salary);
                }
            }
        }
    }



}
