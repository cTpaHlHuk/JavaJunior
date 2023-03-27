package Lesson3.DZ;

public class DZ3 {
    public static void main(String[] args) {
        //3) Необходимо вывести на экран таблицу умножения на 3:например.
        //3*1=3
        //3*2=6

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", (j*i));
            }
            System.out.println();
        }
    }
}
