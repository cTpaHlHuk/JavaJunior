package Lesson1;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //3. ��������� ����� ������������ �� ���������  6 10
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ ������� �������������� ������������ ");
        double a = scanner.nextDouble();
        double h = a * Math.sqrt(3) / 2; //������
        double s = 1 / 2.0 * a * h;
        double v = s * h;//�����

        System.out.println("����� �������������� ������������ ����� = " + v);


    }
}
