package Lesson4;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите кол во минут дл€ таймера ");
        int m = scanner.nextInt();
        m = m - 1;

        for (; m >= 0; m--) {
            for (int sec = 59; sec >= 0; sec--) {
                System.out.println("ќсталось " + m + "мин " + sec + "секунд ");
                Thread.sleep(100);
            }
        }
    }
}
