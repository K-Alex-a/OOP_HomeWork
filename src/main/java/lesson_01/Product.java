package lesson_01;

public class Product {
    protected int id;
    protected String name;
    protected String brand;
    protected double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        processPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        processName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        processBrand(brand);
    }


    public Product(int id) {
        this(id, "[product]", 100);
    }

    public Product(int id, String name, double price) {
        this(id, name, "[brand]", price);
    }

    public Product(int id, String name, String brand, double price) {
        this.id = id;
        processName(name);
        processBrand(brand);
        processPrice(price);
    }

    private void processName(String name) {
        if (name == null || name.length() < 3) {
            this.name = "[product]";
        } else {
            this.name = name;
        }
    }

    private void processBrand(String brand) {
        if (brand == null || brand.length() < 3) {
            this.brand = "[brand]";
        } else {
            this.brand = brand;

        }
    }

    private void processPrice(double price) {
        if (price < 100)
            this.price = 100;
        else {
            this.price = price;
        }
    }



    protected String baseInfo() {
        return String.format("(id: %d) %s - %s - %.2fр.", id, name, brand, price);
    }

    public String displayInfo() {
        return baseInfo();
    }

    @Override
    public String toString() {
        return displayInfo();
    }


}
