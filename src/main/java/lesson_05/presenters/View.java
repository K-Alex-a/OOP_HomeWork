package Seminars.seminar_05.group_2.task_1.presenters;

import Seminars.seminar_05.group_2.task_1.models.Table;
import java.util.Collection;

public interface View {

    void showTables(Collection<Table>tables);

    void showReservationTableResult(int reservationNo);

    void registerObserver(ViewObserver observer);

    void showChangeReservationTableResult(int oldReservation, int reservationNo);




}
