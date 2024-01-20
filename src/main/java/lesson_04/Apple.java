package lesson_04;

public class Apple extends Fruit<FruitData> implements FruitData {

    public Apple() {
       super(1f);
    }


    @Override
    public String toString() {
        return String.format("Вес яблока: %.2f", getWeight());
    }


    @Override
    public String getId() {
        return "яблоко";
    }
}
