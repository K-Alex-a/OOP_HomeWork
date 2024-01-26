package Seminars.seminar_05.group_2.task_1;

import Seminars.seminar_05.group_2.task_1.models.TableService;
import Seminars.seminar_05.group_2.task_1.presenters.BookingPresenter;
import Seminars.seminar_05.group_2.task_1.presenters.Model;
import Seminars.seminar_05.group_2.task_1.presenters.View;
import Seminars.seminar_05.group_2.task_1.views.BookingView;

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
