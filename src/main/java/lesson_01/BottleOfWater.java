package lesson_01;

public class BottleOfWater extends Product{

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public BottleOfWater(int id,
                         String name,
                         String brand,
                         double price,
                         double volume){
        super(id, name, brand, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return "[Бутылка воды]: "
                + baseInfo()
                + String.format(" Объем: %.2fл.;", volume);
    }
}
