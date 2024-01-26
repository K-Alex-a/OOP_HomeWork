package lesson_05.presenters;

import lesson_05.models.Table;

import java.util.Collection;

public interface View {

    void showTables(Collection<Table>tables);

    void showReservationTableResult(int reservationNo);

    void registerObserver(ViewObserver observer);

    void showChangeReservationTableResult(int oldReservation, int reservationNo);




}
