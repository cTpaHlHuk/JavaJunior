package Lesson12;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> qwe = new ArrayList<>();

        qwe.add("�����");
        qwe.add("����");
        qwe.add("����");
        qwe.add("�����");

        //qwe.add(0, "������");
        qwe.add( "������");
        qwe.set(3,"����");

        System.out.println(qwe.contains("����"));

        System.out.println(qwe.indexOf("����"));

        System.out.println(qwe.toString());
        System.out.println();

    }
}
