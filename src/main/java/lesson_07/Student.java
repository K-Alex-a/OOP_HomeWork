package lesson_07;

import java.util.ArrayList;
import java.util.List;

public class Student implements  Observer{

    private String name;
    private int salary;
    private List<TypeVacancy> vacancy;


    public Student(String name) {
        this.name = name;
        salary = 5000;
        vacancy = new ArrayList<>();
        vacancy.add(TypeVacancy.Cleaner);
        vacancy.add(TypeVacancy.Assistant);
        vacancy.add(TypeVacancy.Administrator);
        vacancy.add(TypeVacancy.Specialist);
        vacancy.add(TypeVacancy.Clerk);
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, TypeVacancy vacancy) {
        for (TypeVacancy type : this.vacancy) {
            if (type.equals(vacancy)) {
                if (this.salary <= salary) {
                    System.out.printf("Студент (%s): Мне нужна эта работа! (компания: %s; должность: %s; заработная плата: %d)\n",
                            name, nameCompany, vacancy, salary);
                    this.salary = salary;
                } else {
                    System.out.printf("Студент (%s): Я найду работу получше! (компания: %s; должность: %s; заработная плата: %d)\n",
                            name, nameCompany, vacancy, salary);
                }
            }
        }
    }


}
