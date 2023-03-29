package Lesson4;

public class MassExample {
    public static void main(String[] args) {
        int[][] n = new int[9][9];
        int c = 0;

        //заполнить от нуля до 81

//        for (int i = 0; i < n.length; i++) {
//            for (int j = 0; j < n[i].length; j++) {
//                n[i][j] = c;
//                System.out.print(n[i][j] + " ");
//                c++;
//            }
//            System.out.println();
//        }

        int[][] q = new int[9][9];
//        for (int i = 0; i < q.length; i++) {
//            for (int j = 0; j < q[i].length; j++) {
//                if (j < q[i].length - 1 - i) {
//                    System.out.print(q[i][j] + " ");
//                } else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();

        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q[i].length; j++) {
                if (i>=j) {
                    System.out.print("* ");
                } else {
                    System.out.print(q[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
