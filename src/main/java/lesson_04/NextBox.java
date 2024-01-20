package lesson_04;

import java.util.ArrayList;

public class NextBox<T extends Box<?>> extends Box<Fruit<?>>  {


    /**
     * Конструктор
     * @param arrayList массив
     */
    public NextBox(ArrayList<Fruit<?>> arrayList) {
        super(arrayList);
    }
}
