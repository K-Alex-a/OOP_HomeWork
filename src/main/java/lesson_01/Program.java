package lesson_01;


public class Program {

    public static void main(String[] args) {

        int id = 0;

        Product bottleOfWater1 =
                new BottleOfWater(id++, "Вода #1", "ООО Источник", 250, 0.5);

        Product bottleOfMilk1 =
                new BottleOfMilk(id++, "Молоко #1", "ООО Источник", 250, 1, 25);

        Product bottleOfMilk2 =
                new BottleOfMilk(id++, "Молоко #2", "ООО Источник", 280, 1.5, 1);

        Product bottleOfMilk3 =
                new BottleOfMilk(id++, "Молоко #3", "ООО Источник", 150, 0.5, 5);

        Product bottleOfMilk4 =
                new BottleOfMilk(id++, "Молоко #4", "ООО Источник", 290, 2, 25);
        System.out.println();

        Product choco1 =
                new Chocolate(id++, "Dove", "Mars", 110, 80, "молочный", 546.4);

        Product choco2 =
                new Chocolate(id++, "Аленка", "Красный Октябрь", 85, 80, "молочный", 550.0);


        VendingMachine machine = new VendingMachine();
        machine.addProduct(bottleOfWater1);
        machine.addProduct(bottleOfMilk1);
        machine.addProduct(bottleOfMilk2);
        machine.addProduct(bottleOfMilk3);
        machine.addProduct(bottleOfMilk4);
        machine.addProduct(choco1);
        machine.addProduct(choco2);
        System.out.println(machine);
        System.out.println();

        System.out.println(machine.saleById(5));
        System.out.println(machine.saleById(7));

    }
}

