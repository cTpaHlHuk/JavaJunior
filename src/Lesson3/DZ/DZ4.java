package Lesson3.DZ;

import java.util.Scanner;

public class DZ4 {
    public static void main(String[] args) {
        //4)�������� ���������, ��� � ��� ���� ����� �����. � ��������� ��������� � ��������  ��� ����� �� 1 �� �����  �����.
        //��������: 3
        //1+2+3=6
        //1*2*3=6

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����, ��� �� ������� � �������� �� 1 ");
        int num = scanner.nextInt();

        int summ = 0;
        int mnoj = 1;

        for (int i = 1; i <= num; i++) {
            summ = summ + i;
            mnoj = mnoj * i;
        }
        System.out.println("����� = " + summ);
        System.out.println("��������� = " + mnoj);
    }
}
