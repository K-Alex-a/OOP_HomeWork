package lesson_04;

import java.util.ArrayList;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Box<Orange> boxOrange = new Box<>(new ArrayList<>());
        boxOrange.add(orange1);
        boxOrange.add(orange2);
        boxOrange.add(orange3);
//        boxOrange.getWeightInfo();

        Box<Apple> boxApple1 = new Box<>(new ArrayList<>());
        boxApple1.add(apple1);
        boxApple1.add(apple2);
        boxApple1.add(apple3);
//        boxApple1.getWeightInfo();

        Box<Apple> boxApple2 = new Box<>(new ArrayList<>());
        boxApple2.add(apple1);
        boxApple2.add(apple2);
        boxApple2.add(apple3);
        System.out.println(boxApple2.getWeight());
//        boxApple2.getWeightInfo();



        TransferFruit<Box<?>> transferFruit = new TransferFruit<>(boxApple1, boxApple2);
        transferFruit.execute();
        System.out.println();
//        System.out.println(boxApple1.getIdBox());





    }
}
