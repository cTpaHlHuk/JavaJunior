package Lesson6;

import java.util.Scanner;

public class EmailProverca {
    public static void main(String[] args) {
        boolean proverkaEmail = true;
        while (proverkaEmail) {
            System.out.println("������� �����");
            Scanner sc = new Scanner(System.in);
            String login = sc.nextLine();

            String replace = login.replace("@", "");
            if (login.length() - replace.length() == 0) {
                System.out.println("��� @");
            } else if (login.length() - replace.length() > 1) {
                System.out.println("@ ������� �����");
            } else {
                proverkaEmail = false;
            }
        }
        System.out.println("������� ������");
    }
}
