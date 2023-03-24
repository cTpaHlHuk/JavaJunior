package Lesson3;

public class ArrayTeam {
    public static void main(String[] args) {
        int [] mass = new int [10];

        mass[2] = 42;
       // System.out.println(mass[2]);

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}
