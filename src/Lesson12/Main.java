package Lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

//        for (int i = 0; i < 100000; i++) {
//            arrayList.add(i);
//        }
//        for (int i = 0; i < 100000; i++) {
//            linkedList.add(i);
//        }

        long startArray = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0,i);
        }

        long endArray = System.currentTimeMillis();
        System.out.println(endArray-startArray);


        long startLink = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0,i);
        }

        long endLink = System.currentTimeMillis();
        System.out.println(endLink-startLink);


    }
}
