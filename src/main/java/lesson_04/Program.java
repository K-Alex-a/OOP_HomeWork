package lesson_04;


public class Program {
    public static void main(String[] args) {
        Orange orange = new Orange();
        Apple apple = new Apple();


        Box<Orange> boxOrange = new Box<>(1);
        boxOrange.add(orange);
        boxOrange.add(orange);
        boxOrange.add(orange);
        boxOrange.delete();
        boxOrange.infoWeight();
        boxOrange.infoSize();
        System.out.println();

        Box<Apple> boxApple1 = new Box<>(2);
        boxApple1.add(apple);
        boxApple1.add(apple);
        boxApple1.add(apple);
        boxApple1.add(apple);
        boxApple1.infoWeight();
        boxApple1.infoSize();
        System.out.println();

        Box<Apple> boxApple2 = new Box<>(3);
        boxApple2.add(apple);
        boxApple2.add(apple);
        boxApple2.add(apple);
        boxApple2.add(apple);
        boxApple2.infoWeight();
        boxApple2.infoSize();
        System.out.println();
        System.out.println();


        TransferFruit<Box<?>> transferFruit = new TransferFruit<>(boxApple2, boxApple1);
        transferFruit.execute();
        System.out.println();

        boxApple2.infoWeight();
        System.out.println(boxApple2.getSize());

        boxApple1.infoWeight();
        System.out.println(boxApple1.getSize());
        System.out.println();

        boxApple2.delete();
        boxApple2.infoWeight();
        boxApple2.infoSize();


        System.out.println(boxApple1.compare(boxApple2));






    }
}
