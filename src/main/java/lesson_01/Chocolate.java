package lesson_01;

public class Chocolate extends Product {
    private int weight;
    private String savor;
    private double calories;

    public Chocolate(int id, String name, String brand, double price, int weight, String savor, Double calories) {
        super(id, name, brand, price);
        this.weight = weight;
        this.savor = savor;
        this.calories = calories;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSavor() {
        return savor;
    }

    public void setSavor(String savor) {
        this.savor = savor;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return "[Шоколадка]: "
                + baseInfo()
                + String.format(" Вес: %dгр.; Вкус: %s; kkal: %.2f", weight, savor, calories);
    }
}
