package Lesson4;

public class Mass {
    public static void main(String[] args) {
        int[] m = new int[10];
        int[][] m2 = new int[10][4];
        m2[2][1] = 99;
        int [][][] a = new int[3][2][1];



        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j <m2[i].length; j++) {
                System.out.print(m2[i][j]);
            }
            System.out.println();
        }
    }
}
