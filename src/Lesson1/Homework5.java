package Lesson1;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        //2.�������� ��������� ������� ������ ������� � ���� ����� �������� �� ���������� ����� �� 3 ���� � ���������� ������� 10% �������.
        //����������� ������������� - ���������� �� �������
        //Math.pow(�����, �������)

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� ������� � ��� ���� �� ���������� �����");
        double summ = scanner.nextDouble();
        System.out.println("������� ����� ������� �� ������� ������ �������� �� ����");
        int mount = scanner.nextInt();
        System.out.println("������� ���������� ������ ����� �������");
        double percent = scanner.nextDouble();

        double formula = 1 + (percent / 100) / mount;

        double summAll = summ * Math.pow(formula, mount);
        System.out.println("�� �������� �� " + mount + " ������� " + summAll);

    }
}
