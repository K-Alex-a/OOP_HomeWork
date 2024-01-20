package lesson_04;

import java.util.ArrayList;

public class CurrentBox<T extends Box<?>> extends Box<Fruit<?>> {


    /**
     * Конструктор
     * @param arrayList массив
     */
    public CurrentBox(ArrayList<Fruit<?>> arrayList) {
        super(arrayList);
    }
}
