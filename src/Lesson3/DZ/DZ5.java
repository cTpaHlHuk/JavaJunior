package Lesson3.DZ;

import java.util.Scanner;

public class DZ5 {
    public static void main(String[] args) {
        //5) �������� ���������, ��� � ��� ���� ����� �����. � ��������� ��������� � ��������  ��� ����� �� 1 �� �����  ����� ������ ������ �����;
        //��������: 5
        //2+4 =6
        //2*4=8

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����, ��� �� ������� � �������� �� 1 ");
        int num = scanner.nextInt();

        int summ = 0;
        int mnoj = 1;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                summ = summ + i;
                mnoj = mnoj * i;
            }
        }
        System.out.println("����� ������ = " + summ);
        System.out.println("��������� ������ = " + mnoj);
    }
}
