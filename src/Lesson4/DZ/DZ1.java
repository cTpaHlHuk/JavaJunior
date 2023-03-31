package Lesson4.DZ;

public class DZ1 {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];

        //слева на право
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == i){
                    System.out.print("* ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
