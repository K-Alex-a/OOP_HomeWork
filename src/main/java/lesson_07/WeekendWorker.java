package lesson_07;

import java.util.ArrayList;
import java.util.List;

public class WeekendWorker implements Observer {

    private String name;
    private int salary;
    private List<TypeVacancy> vacancy;


    public WeekendWorker(String name) {
        this.name = name;
        salary = 45000;
        vacancy = new ArrayList<>();
        vacancy.add(TypeVacancy.Assistant);
        vacancy.add(TypeVacancy.Administrator);
        vacancy.add(TypeVacancy.Specialist);
        vacancy.add(TypeVacancy.Clerk);
        vacancy.add(TypeVacancy.Manager);
        vacancy.add(TypeVacancy.Supervisor);
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
