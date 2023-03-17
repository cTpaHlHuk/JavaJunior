package Lesson1;

public class Homework1 {
    public static void main(String[] args) {
        //Дано 1000
        //пицца 135. булка 78, жвачка 3
        //купить максимум пицц, булок, жвачек на ост

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
//        System.out.println("Кол-во пицц = " + pizzaAmount);
//        System.out.println("Кол-во булок = " + bunAmount);
//        System.out.println("Кол-во жвачек = " + gumAmount);
//        System.out.println("Кол-во денег осталось = " + moneyOst);

        System.out.println("Кол-во пицц = " + money / pizzaPrice);
        System.out.println("Кол-во булок = " + money % pizzaPrice / bunPrice);
        System.out.println("Кол-во жвачек = " + money % pizzaPrice % bunPrice / gumPrice);
        System.out.println("Кол-во денег осталось = " + money % pizzaPrice % bunPrice % gumPrice / ost);
    }
}
