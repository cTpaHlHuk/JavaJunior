package Lesson4.DZ;

public class DZ2 {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];

        //справа на лево
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr.length - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
