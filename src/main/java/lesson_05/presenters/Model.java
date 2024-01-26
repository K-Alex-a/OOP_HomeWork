package lesson_05.presenters;

import lesson_05.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTable();
    int reservationTable(Date reservationDate, int tableNo, String name);
    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

}
