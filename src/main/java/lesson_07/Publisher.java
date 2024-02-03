package lesson_07;

public interface Publisher {

    void  registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void sendOffer(String company, int salary, TypeVacancy vacancy);
}
