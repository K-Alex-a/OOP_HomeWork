package Seminars.seminar_05.group_2.task_1.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/**
 * Столики
 */
public class Table {

    /**
     * Номер столика
     */
    private int no;

    /**
     * Счетчик
     */
    private static int counter;

    /**
     * Коллекция состояния брони столика
     */
    private final Collection<Reservation> reservations = new ArrayList<>();



    public Table() {
        no = ++counter;
    }

    public int getNo() {
        return no;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Столик #%d", no);
    }
}
