package Lesson2;

public class DZ5 {
    public static void main(String[] args) {
        // 5) ������� �� ������� ��� ����� �� 20 �� 60, ��������� �������� �� 30 �� 40 ������������

        for (int i = 20; i <= 60; i++) {
            if (i < 30 || i > 40) {
                System.out.println(i);
            }
        }
    }
}
