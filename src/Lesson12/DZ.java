package Lesson12;

import java.util.ArrayList;


public class DZ {
    public static void main(String[] args) {

        //a=1,2,3
        // b=3,4,5
        //����������� 3
        //������������� �������� 1245
        //����������� 123345
        //�������� 12   ������ ����� ������

        ArrayList<Integer> arrayListA = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            arrayListA.add(i);
        }
        ArrayList<Integer> arrayListB = new ArrayList<>();
        for (int i = 3; i < 6; i++) {
            arrayListB.add(i);
        }

        ArrayList<Integer> arrayListC = new ArrayList<>();
        arrayListC.addAll(arrayListA);
        arrayListC.addAll(arrayListB);

        System.out.println("����������� ��������� " + arrayListC);

        arrayListC.retainAll(arrayListA);
        arrayListC.retainAll(arrayListB);

        System.out.println("����������� ��������� " + arrayListC);

        arrayListA.removeAll(arrayListB);

        System.out.println("������������� �������� " + arrayListA);



    }
}
