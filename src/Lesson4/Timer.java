package Lesson4;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ��� �� ����� ��� ������� ");
        int m = scanner.nextInt();
        m = m - 1;

        for (; m >= 0; m--) {
            for (int sec = 59; sec >= 0; sec--) {
                System.out.println("�������� " + m + "��� " + sec + "������ ");
                Thread.sleep(100);
            }
        }
    }
}
