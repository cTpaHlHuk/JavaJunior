package Lesson1;

public class Homework1 {
    public static void main(String[] args) {
        //���� 1000
        //����� 135. ����� 78, ������ 3
        //������ �������� ����, �����, ������ �� ���

        int pizzaPrice = 135;
        int bunPrice = 78;
        int gumPrice = 3;
        int money = 1000;
        int ost = 1;


        int pizzaAmount = money / pizzaPrice;
        int bunAmount = (money - pizzaAmount * pizzaPrice) / bunPrice;
        int gumAmount = (money - pizzaAmount * pizzaPrice - bunAmount * bunPrice) / gumPrice;
        int moneyOst = money - pizzaAmount * pizzaPrice - bunAmount * bunPrice - gumAmount * gumPrice;
//
//        System.out.println("���-�� ���� = " + pizzaAmount);
//        System.out.println("���-�� ����� = " + bunAmount);
//        System.out.println("���-�� ������ = " + gumAmount);
//        System.out.println("���-�� ����� �������� = " + moneyOst);

        System.out.println("���-�� ���� = " + money / pizzaPrice);
        System.out.println("���-�� ����� = " + money % pizzaPrice / bunPrice);
        System.out.println("���-�� ������ = " + money % pizzaPrice % bunPrice / gumPrice);
        System.out.println("���-�� ����� �������� = " + money % pizzaPrice % bunPrice % gumPrice / ost);
    }
}
