package Lesson12;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> qwe = new ArrayList<>();

        qwe.add("Дамир");
        qwe.add("Илья");
        qwe.add("Дима");
        qwe.add("Айдар");

        //qwe.add(0, "Барсик");
        qwe.add( "Барсик");
        qwe.set(3,"Вова");

        System.out.println(qwe.contains("Вова"));

        System.out.println(qwe.indexOf("Вова"));

        System.out.println(qwe.toString());
        System.out.println();

    }
}
