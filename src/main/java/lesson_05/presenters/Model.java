package Seminars.seminar_05.group_2.task_1.presenters;

import Seminars.seminar_05.group_2.task_1.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTable();
    int reservationTable(Date reservationDate, int tableNo, String name);
    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

}
