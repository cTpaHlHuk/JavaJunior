package Lesson4.DZ;

public class DZ5 {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];

        // ромб пустой внутри
        //i== arr.length/2+j||j == arr.length / 2 - i || j == arr.length / 2 + i

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j - arr.length+1 == arr.length / 2 - i || i == arr.length / 2 + j || j == arr.length / 2 - i || j == arr.length / 2 + i) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}


