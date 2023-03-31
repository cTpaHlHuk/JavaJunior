package Lesson4.DZ;

public class DZ3 {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];

        //от центра вниз вверх, влево вправо
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr.length / 2 || i == arr.length / 2 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
