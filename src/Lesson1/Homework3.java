package Lesson1;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //3. Посчитать объём треугольника со сторонами  6 10
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну стороны прямоугольного треугольника ");
        double a = scanner.nextDouble();
        double h = a * Math.sqrt(3) / 2; //высота
        double s = 1 / 2.0 * a * h;
        double v = s * h;//объем

        System.out.println("Объем прямоугольного треугольника будет = " + v);


    }
}
