package Lesson3.DZ;

import java.util.Arrays;

public class DZ6 {
    public static void main(String[] args) {
        //6) создать массив, с целыми числами в диапазоне от 20 до 80 только которые делятся на 3 но не делится на 5: например
        //21 делится на 3 но не делится на 5 так что попадёт в массив. 60 делится на 3 и на 5 не подходит

        int[] mass1 = new int[60];
//        int size = 0;
//
//        for (int i = 0; i < mass1.length; i++) {
//            mass1[i] = i + 20;
//            if (mass1[i] % 3 == 0 && mass1[i] % 5 != 0) {
//                size++;
//            }
//        }
//
//        int[] mass2 = new int[size];
//        int index = 0;
//        for (int i = 0; i < mass1.length; i++) {
//            if (mass1[i] % 3 == 0 && mass1[i] % 5 != 0) {
//                mass2[index] = mass1[i];
//                System.out.print(mass2[index] + " ");
//                index++;
//            }
//        }

        int size = 0;

        for (int i = 20; i <= 80; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                size++;
            }
        }

        int[] mass = new int[size];
        int index = 0;

        for (int j = 20; j <= 80; j++) {
                if (j % 3 == 0 && j % 5 != 0) {
                    mass[index] = j;
                    System.out.print(mass[index] + " ");
                    index++;
                }
        }
    }
}

