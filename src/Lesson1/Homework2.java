package Lesson1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //1.Написать программу для определения положительное или отрицательное число.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }
}
