package Lesson2;

public class IfElseExample {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        if (a == b && b != c ||
                a == c && c != b ||
                c == b && b != a) {
            System.out.println("��������������");
        } else if (a == b && b == c && c == a) {
            System.out.println("�������������");
        } else if (a != b && b != c && c !=a){
            System.out.println("��������������");
        } else {
            System.out.println("����������� �����������");
        }
    }
}
