package Seminars.seminar_05.group_2.task_1.presenters;

import java.util.Date;

public class BookingPresenter implements ViewObserver {

    /**
     * Ссылка на представление
     */
    private View view;

    /**
     * Ссылка на модель данных
     */
    private Model model;


    public BookingPresenter(View view, Model model) {
        this.view = view;
        this.model = model;
        this.view.registerObserver(this);
    }

    public void updateTablesView() {
        view.showTables(model.loadTable());
    }

    private void updateReservationTableView(int reservationNo) {
        view.showReservationTableResult(reservationNo);
    }

    private void updateChangeReservationTableView(int oldReservation, int reservationNo) {
        view.showChangeReservationTableResult(oldReservation, reservationNo);
    }


    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            updateReservationTableView(reservationNo);
        } catch (Exception e) {
            updateReservationTableView(-1);
        }
    }


    @Override
    public void onChangeReservationTable(int oldReservation, Date orderDate, int tableNo, String name) {
        try {
                int reservationNo = model.changeReservationTable(oldReservation, orderDate, tableNo, name);
                updateChangeReservationTableView(oldReservation, reservationNo);

        } catch (Exception e) {
            updateChangeReservationTableView(-1, -1);
        }
    }


}
