package lesson_04;

public class Apple extends Fruit<FruitData> implements FruitData{

    /**
     * Конструктор
     */
    public Apple() {
        super("яблоко", 1.0f);
    }

}
