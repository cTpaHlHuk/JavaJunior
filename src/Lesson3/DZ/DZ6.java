package Lesson3.DZ;

import java.util.Arrays;

public class DZ6 {
    public static void main(String[] args) {
        //6) ������� ������, � ������ ������� � ��������� �� 20 �� 80 ������ ������� ������� �� 3 �� �� ������� �� 5: ��������
        //21 ������� �� 3 �� �� ������� �� 5 ��� ��� ������ � ������. 60 ������� �� 3 � �� 5 �� ��������

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

