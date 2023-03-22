package Lesson2;

public class DZ4 {
    public static void main(String[] args) {
        //4) *** ѕосчитать сколько нужно лет, чтоб собрать сумму в 200т рублей, если откладывать ежемес€чно по 9500

        double sum = 200000;
        double sumMount = 9500;
        double mount = 0;
        double age = 12;

        for (int i = 0; i <= sum; i+=sumMount) {
            mount++;
        }
        System.out.println("Ќужно " + Math.round(mount/age) + "лет(года)");  //выходит 1.83333 мес, округлил до целого
    }
}
