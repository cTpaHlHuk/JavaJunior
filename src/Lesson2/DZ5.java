package Lesson2;

public class DZ5 {
    public static void main(String[] args) {
        // 5) ¬ывести на консоль все числа от 20 до 60, пропуска€ диапазон от 30 до 40 включительно

        for (int i = 20; i <= 60; i++) {
            if (i < 30 || i > 40) {
                System.out.println(i);
            }
        }
    }
}
