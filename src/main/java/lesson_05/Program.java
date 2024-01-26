package lesson_05;

import lesson_05.models.TableService;
import lesson_05.presenters.BookingPresenter;
import lesson_05.presenters.Model;
import lesson_05.views.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Model model = new TableService();
        BookingView view = new BookingView();

        BookingPresenter presenter = new BookingPresenter(view, model);
        presenter.updateTablesView();

        view.reservationTable(new Date(), 1, "Станислав");
        System.out.println();

        view.changeReservationTable(1001, new Date(), 2, "Станислав");
        System.out.println();

        view.changeReservationTable(1002, new Date(), 3, "Станислав");
        System.out.println();

        view.changeReservationTable(1004, new Date(), 4, "Станислав");
        System.out.println();
    }
}
