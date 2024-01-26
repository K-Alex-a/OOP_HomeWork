package lesson_05.models;

import lesson_05.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableService implements Model {


    private Collection<Table> tables;

    @Override
    public Collection<Table> loadTable() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }



    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(table, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }

    @ Override
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
        Collection<Reservation> reservations = table.getReservations();
            for (Reservation reservation : reservations) {
                if (reservation.getId() == oldReservation && tables.size() >= tableNo) {
                table.getReservations().remove(reservation);
                Reservation newReservation = new Reservation(table, reservationDate, name);
                table.getReservations().add(newReservation);
                return newReservation.getId();
                }
            }
            throw new RuntimeException("Некорректный номер брони");
        }
        throw new RuntimeException("Некорректный номер столика");
    }
}
