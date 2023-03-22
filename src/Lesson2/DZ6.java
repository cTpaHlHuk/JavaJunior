package Lesson2;

public class DZ6 {
    public static void main(String[] args) {
        //6) ** напечатать список платежей для кредита на 1 000 000 рублей, с процентной ставкой 11.8 процента, если я хочу взять на 3 года, 5 лет, 10 лет.

        float sum = 1000000f;
        int age = 3;
        float proc = 11.8f;

        float stavkaMount = proc / 100 / 12;
        double platej = sum * ((stavkaMount * Math.pow((1 + stavkaMount), 12 * age)) / (Math.pow((1 + stavkaMount), 12 * age) - 1));
        double sum2 = 12 * age * platej;

        System.out.println("Платеж составит = " + platej);
        System.out.println("Общая сумма = " + sum2);
        System.out.println();

//        for (int i = 1; i <= age*12; i++) {
//            System.out.println(platej);
//        }
    }
}
