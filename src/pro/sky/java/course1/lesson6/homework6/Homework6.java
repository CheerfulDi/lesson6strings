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

        fullName = fullName.replace("; ", " ");

//        с методами indexOf() и lastIndexOf() что-то пошло не так(
//        String[] words = fullName.split(" ");
//
//
//        int a = fullName.indexOf(words[2]);

        System.out.println("Имя сотрудника - " + fullName.substring(7, 12));
        System.out.println("Фамилия сотрудника - " + fullName.substring(0, 7));
        System.out.println("Отчество сотрудника - " + fullName.substring(12));

        System.out.println();

        // Повышенная сложность. Задание 6

        String fullName3 = "ivanov ivan ivanovich";

        String[] words2 = fullName3.split(" ");

        String a = "";
        a += words2[0].substring(0, 1).toUpperCase();


//        for (int i = 0; i < words2.length; i++) {
//            a += words2[i].substring(i, i+1).toUpperCase();
//        }

        System.out.println(a);





    }
}
