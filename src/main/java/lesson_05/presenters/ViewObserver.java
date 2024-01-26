package Seminars.seminar_05.group_2.task_1.presenters;

import java.util.Date;

/**
 * Наблюдатель за представлением
 */
public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);
    void onChangeReservationTable(int oldReservation, Date orderDate, int tableNo, String name);
}
