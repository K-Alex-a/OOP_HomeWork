package lesson_07;

public class Program {
    public static void main(String[] args) {

        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 120000);
        Company yandex = new Company("Yandex", publisher, 95000);
        Company geekBrains = new Company("GeekBrains", publisher, 98000);

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");
        WeekendWorker weekendWorker1 = new WeekendWorker("Рабочий выходного дня #1");
        WeekendWorker weekendWorker2 = new WeekendWorker("Рабочий выходного дня #2");


        publisher.registerObserver(student1);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(weekendWorker1);


        for (int i = 0; i < 3; i++) {
            google.needEmployee(TypeVacancy.Manager);
            yandex.needEmployee(TypeVacancy.Director);
            geekBrains.needEmployee(TypeVacancy.Administrator);
            System.out.println();
        }


    }
}
