package lesson_05.views;


import lesson_05.models.Table;
import lesson_05.presenters.View;
import lesson_05.presenters.ViewObserver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Представление бронирования
 */
public class BookingView implements View {

    /**
     * Наблюдатели
     */
    private Collection<ViewObserver> observers;

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0) {
            System.out.printf("Столик успешно забронирован. Номер брони: #%d\n", reservationNo);
        } else {
            System.out.println("Произошла ошибка при попытке забронировать столик.\nПовторите операцию позже.");
        }
    }

    @Override
    public void registerObserver(ViewObserver observer) {
        if (observers == null) {
            observers = new ArrayList<>();
            observers.add(observer);

        }
    }


    public void reservationTable(Date orderDate, int tableNo, String name) {
        if (observers != null) {
            for (ViewObserver observer : observers) {
                observer.onReservationTable(orderDate, tableNo, name);
            }
        }
    }


    public void changeReservationTable(int oldObservation, Date reservationDate, int tableNo, String name) {
        if (observers != null) {
            for (ViewObserver observer : observers) {
                observer.onChangeReservationTable(oldObservation, reservationDate, tableNo, name);
            }
        }
    }


    @Override
    public void showChangeReservationTableResult(int oldReservation, int reservationNo) {
        if (oldReservation > 0) {
            System.out.printf("Бронь #%d успешно отменена.\n" +
                            "Новый столик успешно забронирован. Номер брони: #%d\n",
                    oldReservation,
                    reservationNo);
        } else {
            System.out.println("Произошла ошибка при попытке отмены бронирования столика.\nПовторите операцию позже.");
        }
    }

}
