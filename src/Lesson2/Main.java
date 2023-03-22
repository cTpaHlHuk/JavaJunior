package Lesson2;

public class Main {
    public static void main(String[] args) {
        //Вывести числа от 10 до 0

//        for (int i = 10; i >= 0 ; i--) {
//            System.out.println(i);
//        }

//        for (int i = 30; i <= 60; i++) {
//            System.out.println(i);
//        }

//        for (int i = 30; i <= 60; i+=2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= 70; i--) {
//            if (i <= 80 || i >= 90) {
//                System.out.println(i);
//            }
//        }

//        for (int i = 10; i <= 100; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                System.out.println(i);
//            }
//        }

        int a = 0;
        int b = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                a++;
            }
            if (i % 5 == 0) {
                b++;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }

}
