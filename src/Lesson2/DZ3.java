package Lesson2;

public class DZ3 {
    public static void main(String[] args) {
        //3) Кол-во четных чисел в диапазоне от 30 до 61

        int counter = 0;

        for (int i = 30; i <= 61; i++) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
