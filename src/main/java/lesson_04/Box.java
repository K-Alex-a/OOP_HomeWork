package lesson_04;

import java.util.ArrayList;

public class Box<T extends Fruit<?>> {

    //region Публичные методы

    /**
     * Добавление элемента в массив
     * @param e элемент, который будет добавлен
     */
    public ArrayList<T> add(Fruit<?> e) {
        arrayList.add((T) e);
        return arrayList;
    }


    /**
     * Удаление элемента из массива
     */
    public T delete() {
        return  arrayList.remove(getSize()-1);
    }


    /**
     * Возвращает элемент массива по заданному индексу
     * @param index индекс
     * @return элемент из массива
     */
    public T getByIndex(int index) {
        return arrayList.get(index);
    }

    /**
     * Считает общий вес элементов, находящихся в массиве (коробке)
     * @return возвращает общий вес
     */
    public float getWeight() {
        if (arrayList.size() == 0) {
            return 0;
        } else {
            return arrayList.size() * arrayList.get(0).getWeight();
        }
    }

    /**
     * Вывод информации об общем весе массива (коробки)
     */
    public void infoWeight() {
        System.out.printf("Общий вес коробки #%d: %.2f\n", getIdBox(), getWeight());
    }

    /**
     * Сравнение коробок с разными элементами на предмет одинакового веса
     * @param o передаваемый параметр с массивом (коробкой)
     * @return true - если коробки равны по весу, false - если вес отличается
     */
    public boolean compare(Box<T> o) {
        if (o.getWeight() == getWeight()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Выдает id коробки
     * @return id массива (коробки)
     */
    public int getIdBox() {
        return idBox;
    }

    /**
     * Выдает количество элементов в массиве (коробке)
     * @return количество элементов в массиве
     */
    public int getSize() {
        return arrayList.size();
    }

    /**
     * Вывод информации о количестве элементов в массиве (коробке)
     */
    public void infoSize() {
        System.out.printf("Всего в коробке #%d: %d шт. (%s)\n",
                getIdBox(),
                getSize(),
                arrayList.get(0));
    }
    //endregion


    //region Конструктор

    /**
     * Конструктор, создающий новый массив
     * @param idBox id коробки
     */
    public Box(int idBox) {
        this.arrayList = new ArrayList<>();
        this.idBox = idBox;
    }
    //endregion


    //region Поля

    /**
     * Массив для хранения данных
     */
    private ArrayList<T> arrayList;

    /**
     * id коробки
     */
    private int idBox;
    //endregion

}
