package lesson_01;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> products;


    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }


    public BottleOfMilk getBottleOfMilk(double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfMilk) {
                BottleOfMilk milk = (BottleOfMilk) product;
                if (milk.getVolume() == volume)
                    return milk;
            }
        }
        return null;
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    private Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }


    public String saleById(int id) {
        Product product = getProductById(id);
        if (product != null) {
            return String.format("Вы купили: %s", product);
        } else {
            return "Такого товара нет!";
        }
    }

    public String saleById(String name) {
        Product product = getProductByName(name);
        if (product != null) {
            return String.format("Вы купили: %s", product);
        } else {
            return "Такого товара нет!";
        }
    }



    public void addProduct(Product product) {
        products.add(product);
    }

    private String getProductsInfo() {
        StringBuilder productsInfo = new StringBuilder();
        productsInfo.append("Список товаров:\n");
        for (Product product : products) {
            productsInfo.append(product.displayInfo())
                    .append('\n');
        }
        return String.valueOf(productsInfo);
    }

    @Override
    public String toString() {
        return getProductsInfo();
    }
}
