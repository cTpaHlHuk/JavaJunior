package Lesson3.DZ;

public class DZ2 {
    public static void main(String[] args) {
        //2) массив int[] a = {32, 34, 12, 3, 5, 6, 73, 34,34,67,678,54,56,3456};
        //получить  второй массив b вдвое меньше,
        //а в элементах будет сумма рядом стоящих элементов из массива а;
        //то есть должно получиться
        //b={66,15,11,107,101,760,3512}

        int[] a = {32, 34, 12, 3, 5, 6, 73, 34, 34, 67, 678, 54, 56, 3456, 77};

        if (a.length % 2 == 0) {
            int[] b = new int[a.length / 2];

            for (int i = 0; i < b.length; i++) {
                b[i] = a[i * 2] + a[i * 2 + 1];
                System.out.print(b[i] + " ");
            }
        } else {
            int[] b = new int[a.length / 2 + 1];
            b[b.length - 1] = a[a.length - 1];

            for (int i = 0; i < b.length - 1; i++) {
                b[i] = a[i * 2] + a[i * 2 + 1];
                System.out.print(b[i] + " ");
            }
            System.out.println(b[b.length - 1]);
        }
    }
}
