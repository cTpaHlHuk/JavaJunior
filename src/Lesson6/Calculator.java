package Lesson6;

public class Calculator {
    //умножение деление вычитание сложение

    public static int mul(int a, int b) {
        int res = a * b;
        return res;  //a*b
    }

    public static double del(int a , int b){
        if(b==0){
            System.out.println("На ноль делить нельзя");
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
