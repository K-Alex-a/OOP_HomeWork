package lesson_03;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    /**
     * Генерация списка разнорабочих (Worker, Freelancer)
     *
     * @param count количество рабочих в списке
     * @return список разнорабочих
     */
    public static Employee[] generateEmployees(int count) {
        String[] names = new String[]{"Анатолий", "Глеб", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Герман", "Рубен", "Алексей"};
        String[] surName = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Соколов", "Лыткин", "Горбунов"};

        boolean typeIndex;
        int age;
        int salaryWorker;
        double salaryFreelancer;

        Employee[] employees = new Employee[count];

        for (int i = 0; i < count; i++) {
            typeIndex = random.nextBoolean();
            age = random.nextInt(18, 60);
            salaryWorker = random.nextInt(60000, 120001);
            salaryFreelancer = (random.nextInt(1000, 5000) * 8 * 20.8);

            if (typeIndex) {
                employees[i] = new Freelancer(
                        names[random.nextInt(names.length)],
                        surName[random.nextInt(surName.length)],
                        salaryFreelancer,
                        age);
            } else {
                employees[i] = new Worker(
                        names[random.nextInt(names.length)],
                        surName[random.nextInt(surName.length)],
                        salaryWorker,
                        age);
            }

        }
        return employees;
    }

}
