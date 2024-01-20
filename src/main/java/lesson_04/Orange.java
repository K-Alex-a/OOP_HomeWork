package lesson_04;

public class Orange extends Fruit<FruitData> implements FruitData {

    public Orange() {
        super(1.5f);
    }

    @Override
    public String toString() {
        return String.format("Вес апельсина: %.2f", getWeight());
    }

    @Override
    public String getId() {
        return "апельсин";
    }
}
