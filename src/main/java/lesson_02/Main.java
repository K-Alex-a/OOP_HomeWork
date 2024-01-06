package lesson_02;

public class Main {
    public static void main(String[] args) {
        Cat cat0 = new Cat("Barsik", 8);
        Cat cat1 = new Cat("Barsuchka", 6);
        Cat cat2 = new Cat("Ksksks", 6);
        Cat cat3 = new Cat("BarsikMini", 2);
        Cat cat4 = new Cat("Jora", 15);

        Plate plate = new Plate();
        plate.info();
        plate.addFood(20);
        plate.info();
        System.out.println();


        TimeEat timeEat = new TimeEat();
        timeEat.addAnimal(cat0);
        timeEat.addAnimal(cat1);
        timeEat.addAnimal(cat2);
        timeEat.addAnimal(cat3);
        timeEat.addAnimal(cat4);
        System.out.println(timeEat);


        System.out.println(timeEat.eatingProcess(plate));
        System.out.println(timeEat);
        plate.addFood(10);
        plate.info();
        System.out.println(timeEat.eatingProcess(plate));
        System.out.println(timeEat);

        plate.addFood(10);
        System.out.println(timeEat.eatingProcess(plate));
        System.out.println(timeEat);
        plate.info();
    }
}
