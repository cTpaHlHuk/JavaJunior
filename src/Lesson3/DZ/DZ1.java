package Lesson3.DZ;

public class DZ1 {
    public static void main(String[] args) {
        //1) ��������� ������ �������, ������, ��������
        //int[] a = {32, 34, 12, 3, 5, 6, 73, 34,34,67,678,54,56,3456};
        //��������� ��������� � �������� �������,
        //�� ���� � ������ ���� �����
        //3456,56,54......

        int [] mass = {32, 34, 12, 3, 5, 6, 73, 34,34,67,678,54,56,3456};

        for (int i = mass.length - 1; i > 0; i--) {
            System.out.print(mass[i] + " ");
        }
    }
}
