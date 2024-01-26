package lesson_05.models;

import java.util.Date;

/**
 * Бронирование столиков
 */
public class Reservation {

    /**
     * Счетчик бронирований
     */
    private static int counter = 1000;

    /**
     * id бронирования
     */
    private int id;

    /**
     * Дата бронирования
     */
    private Date date;

    /**
     * Имя клиента
     */
    private String name;

    /**
     * Столик
     */
    private Table table;



    public Reservation(Table table, Date date, String name) {
        id = ++counter;
        this.table = table;
        this.date = date;
        this.name = name;
    }


    public void setTable(Table table) {
        this.table = table;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public Table getTable() {
        return table;
    }
}
