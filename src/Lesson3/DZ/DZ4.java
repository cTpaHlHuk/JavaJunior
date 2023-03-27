package Lesson3.DZ;

import java.util.Scanner;

public class DZ4 {
    public static void main(String[] args) {
        //4)Напишите программу, где у нас есть любое число. А программа суммирует и умножает  все числа от 1 до этого  числа.
        //Например: 3
        //1+2+3=6
        //1*2*3=6

        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите число, что бы сложить и умножить от 1 ");
        int num = scanner.nextInt();

        int summ = 0;
        int mnoj = 1;

        for (int i = 1; i <= num; i++) {
            summ = summ + i;
            mnoj = mnoj * i;
        }
        System.out.println("Сумма = " + summ);
        System.out.println("Умножение = " + mnoj);
    }
}
