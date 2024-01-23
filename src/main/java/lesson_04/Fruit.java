package lesson_04;

public abstract class Fruit<T extends FruitData> {


    //region Публичные поля

    /**
     * Выдает наименование
     * @return наименование
     */
    public String getName() {
        return name;
    }

    /**
     * Выдает вес
     * @return вес
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Вывод информации о продукте
     * @return вес и наименование
     */
    @Override
    public String toString() {
        return String.format("%s; Вес: %.1f", name, weight);
    }
    //endregion


    //region Конструктор

    /**
     * Конструктор
     * @param name наименование
     * @param weight вес
     */
    public Fruit(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }
    //endregion


    //region Поля

    /**
     * Наименование
     */
    private String name;

    /**
     * Вес элемента
     */
    private float weight;
    //endregion
}
