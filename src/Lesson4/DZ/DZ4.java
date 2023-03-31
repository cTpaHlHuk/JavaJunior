package Lesson4.DZ;

public class DZ4 {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];
        int a = arr.length / 2;
        int b = arr.length / 2;

        //ромб
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (a <= j && b >= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            if (i >= arr.length / 2 ) {
                a++;
                b--;
            } else {
                a--;
                b++;
            }
            System.out.println();
        }
    }
}
