package Lesson1;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Homework4 {
    public static void main(String[] args) {
        //��������� ����� ��������
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �������� ");
        double h = scanner.nextDouble();
        System.out.println("������� ������ �������� ");
        double r = scanner.nextDouble();

        double v = PI * Math.pow(r, 2) * h;
        System.out.println("����� �������� = " + v);
    }
}
