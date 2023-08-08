import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №9");
        System.out.println("Массивы. Урок 2");
        int taskNumberRun;
        try {
            taskNumberRun = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Какое задание нужно выполнить? (1-10)"));
        } catch (Exception e) {
            taskNumberRun = 0;
            //e.printStackTrace(); // Выводит сообщение об ошибке
        }
        switch (taskNumberRun) {
            case 1 -> task1();    //Задание 1
            case 2 -> task2();    //Задание 2
            case 3 -> task3();    //Задание 3
//            case 4 -> task4();    //Задание 4
//            case 5 -> task5();    //Задание 5
//            case 6 -> task6();    //Задание 6
//            case 7 -> task7();    //Задание 7
//            case 8 -> task8();    //Задание 8
//            case 9 -> task9();    //Задание 9
//            case 10 -> task10();    //Задание 10
//            case 11 -> task11();    // Задание 12
            default -> System.out.println("Вы не выбрали задание!?: " + taskNumberRun);
        }
        System.out.println("_________");
        System.out.println("Домашка закончилась. Всем спасибо, все свободны.");
    }

    private static void task3() {
        System.out.println("Задание 3");
    }

    private static void task2() {
        System.out.println("Задание 2");
    }

    private static void task1() {
        System.out.println("Задание 1");
        String firstName; // для хранения имени.
        String middleName; // для хранения отчества.
        String lastName; // для хранения фамилии.
        String fullName; // для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".

        Scanner sc = new Scanner(System.in);
        System.out.print("Имя: ");
        firstName = sc.nextLine();
        System.out.print("Отчество: ");
        middleName = sc.nextLine();
        System.out.print("Фамилия: ");
        lastName = sc.nextLine();
        sc.close();

        fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName);
    }

}