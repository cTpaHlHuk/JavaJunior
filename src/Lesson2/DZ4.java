package Lesson2;

public class DZ4 {
    public static void main(String[] args) {
        //4) *** ��������� ������� ����� ���, ���� ������� ����� � 200� ������, ���� ����������� ���������� �� 9500

        double sum = 200000;
        double sumMount = 9500;
        double mount = 0;
        double age = 12;

        for (int i = 0; i <= sum; i+=sumMount) {
            mount++;
        }
        System.out.println("����� " + Math.round(mount/age) + "���(����)");  //������� 1.83333 ���, �������� �� ������
    }
}
