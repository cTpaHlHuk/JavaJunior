package Lesson6;

public class Calculator {
    //��������� ������� ��������� ��������

    public static int mul(int a, int b) {
        int res = a * b;
        return res;  //a*b
    }

    public static double del(int a , int b){
        if(b==0){
            System.out.println("�� ���� ������ ������");
            return 0;
        }
        double t = a;
        return t/b;
    }

    public static int minus(int a , int b){
        return a-b;
    }

    public static int plus(int a , int b){
        return a+b;
    }
}
