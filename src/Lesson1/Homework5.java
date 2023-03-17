package Lesson1;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        //2.написать программу котора€ укажет сколько у теб€ денег соберЄтс€ на банковском счЄте за 3 года с процентной ставкой 10% годовых.
        //≈жемес€чна€ капитализаци€ - считаетьс€ по мес€цам
        //Math.pow(число, степень)

        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите сумму котора€ у вас есть на банковском счете");
        double summ = scanner.nextDouble();
        System.out.println("¬ведите число мес€цев на сколько хотите положить на счет");
        int mount = scanner.nextInt();
        System.out.println("¬ведите процентную ставку банка годовых");
        double percent = scanner.nextDouble();

        double formula = 1 + (percent / 100) / mount;

        double summAll = summ * Math.pow(formula, mount);
        System.out.println("¬ы получите за " + mount + " мес€цев " + summAll);

    }
}
