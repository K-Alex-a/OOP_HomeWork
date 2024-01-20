package lesson_03;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        Employee[] employees = EmployeeFabric.generateEmployees(10);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\n****\n");


        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\n****\n");


        Arrays.sort(employees, new AgeComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
