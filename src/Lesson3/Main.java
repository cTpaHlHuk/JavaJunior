package Lesson3;

public class Main {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 666, 88889, 55, 5555};

//        for (int i = 0; i < mass.length; i++) {
//            System.out.println(mass[i]);
//        }

//        boolean b = true;
//        for (int i = mass.length - 1; i >= 0; i--) {
//            if (b) {
//                System.out.println(mass[i]);
//                b = false;
//            } else {
//                b = true;
//            }

        for (int j = mass.length; j >= 0; j--) {
            if ((mass.length - 1) % 2 == 0) {
                if (j % 2 == 0) {
                    System.out.println(mass[j]);
                }
            } else {
                if (j % 2 != 0) {
                    System.out.println(mass[j]);
                }
            }
        }

    }
}

