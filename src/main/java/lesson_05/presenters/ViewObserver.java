package lesson_05.presenters;

import java.util.Date;

/**
 * Наблюдатель за представлением
 */
public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);
    void onChangeReservationTable(int oldReservation, Date orderDate, int tableNo, String name);
}
