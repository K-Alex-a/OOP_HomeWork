package lesson_07;

import java.util.Random;

/**
 * Компания, которая нуждается в сотрудниках.
 */
public class Company {

    private Publisher jobAgency;
    private String name;
    private int maxSalary;
    private Random random = new Random();




    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(TypeVacancy vacancy) {
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary, vacancy);
    }

}
