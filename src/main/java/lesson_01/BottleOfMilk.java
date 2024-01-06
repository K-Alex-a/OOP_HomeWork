package lesson_01;

public class BottleOfMilk extends Product{

    private double volume;

    private double fat;

    public double getVolume() {
        return volume;
    }

    public BottleOfMilk(int id, String name, String brand, double price, double volume, double fat) {
        super(id, name, brand, price);
        this.volume = volume;
        this.fat = fat;

    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String displayInfo() {
        return "[Бутылка молока]: "
                + baseInfo()
                + String.format(" Объем: %.2fл.; Жирность: %.2f", volume, fat);
    }
}
