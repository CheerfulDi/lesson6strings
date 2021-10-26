package pro.sky.java.course1.lesson6.homework6;

import java.sql.SQLOutput;

public class Homework6 {

    public static void main(String[] args) {

        // Задание 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println(fullName);

        System.out.println();

        // Задание 2

        System.out.println(fullName.toUpperCase());

        System.out.println();

        // Задание 3

        fullName = fullName.replace(" ", "; ");
        System.out.println(fullName);

        System.out.println();

        // Задание 4

        String fullName2 = "Иванов Семён Семёнович";

        fullName2 = fullName2.replace("ё", "е");

        System.out.println("Данные ФИО сотрудника: " + fullName2);

        System.out.println();

        // Повышенная сложность. Задание 5

//        fullName = fullName.replace("; ", " ");
//
//        int n = fullName.lastIndexOf(firstName);
//        int n2 = fullName.lastIndexOf(middleName);
//        System.out.println(n);
//
//        System.out.println("Имя сотрудника - " + fullName.substring(n2, n));





    }
}
