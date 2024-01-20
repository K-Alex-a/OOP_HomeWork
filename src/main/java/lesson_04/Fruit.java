package lesson_04;

public abstract class Fruit<T extends FruitData> {

    private T data;
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public T getData() {
        return data;
    }
}
