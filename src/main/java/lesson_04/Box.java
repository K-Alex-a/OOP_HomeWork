package lesson_04;

import java.util.ArrayList;
import java.util.Comparator;

public class Box<T extends Fruit<?>> {

    //region Публичные методы

    /**
     * Добавление элемента в массив
     * @param e элемент для добавления в массив
     */
    public void add(T e) {
        arrayList.add(++firstIndex, e);
    }


    /**
     * Показывает элемент массива по индексу
     *
     * @param index числовое значение индекса массива
     * @return элемент массива
     */
    public T getByIndex(int index) {
        return arrayList.get(index);
    }


//    /**
//     * Считает общий вес коробки
//     *
//     * @return общий вес коробки
//     */
//    public float sumWeight() {
//        return arrayList.size() * arrayList.get(firstIndex).getWeight();
//    }

//    /**
//     * Показывает общий вес коробки
//     */
//    public void getWeightInfo() {
//        System.out.printf("Общий вес коробки #%d: %.2f\n", idBox, sumWeight());
//    }

    public float getWeight() {
        return arrayList.size() * arrayList.get(firstIndex).getWeight();
    }

//    public void setWeight(float weight) {
//        this.weight = weight;
//    }

//    /**
//     * Сравнивает 2 коробки
//     *
//     * @param o1 the first object to be compared.
//     * @param o2 the second object to be compared.
//     * @return true(1) or false(0)
//     */
//    @Override
//    public int compare(Box<T> o1, Box<T> o2) {
//        return Float.compare(o1.sumWeight(), o2.sumWeight());
////        if (o1.setWeight() == o2.setWeight()) {
////            return 1;
////        } else {
////            return 0;
////        }
//    }


    /**
     * Показывает id коробки
     * @return id коробки
     */
    protected int getIdBox() {
        return idBox;
    }

    //endregion


    //region Конструкторы

    /**
     * Конструктор
     *
     * @param arrayList массив
     */
    public Box(ArrayList<T> arrayList) {
        idBox++;
        this.firstIndex = -1;
        this.arrayList = arrayList;
    }
    //endregion


    //region Поля

    /**
     * Массив элементов
     */
    private ArrayList<T> arrayList;

    /**
     * Первый индекс массива
     */
    private int firstIndex;

    /**
     * Индекс коробки
     */
    private static int idBox;

    private float weight;


    //endregion
}
