package Lesson1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //1.�������� ��������� ��� ����������� ������������� ��� ������������� �����.

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� ");

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("����� �������������");
        } else {
            System.out.println("����� �������������");
        }
    }
}
