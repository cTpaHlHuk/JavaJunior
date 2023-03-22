package Lesson2;

public class Cikle {
    public static void main(String[] args) {
        int age = 3;
        int proc = 10;
        double sum = 100000;

        for (int i = 0; i < age; i++) {
            sum = sum + ( sum * proc / 100.0);
        }
        System.out.println(sum);
    }
}
