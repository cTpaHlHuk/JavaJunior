package Lesson5;

public class Password {
    public static void main(String[] args) {
        String password = "asdfdghfgd";

        if (password.length() < 8) {
            System.out.println("������ ������ 8�� �������� ");
            return;
        }
        System.out.println("�������� ��������� ");

        String alfabet = "abcdefjigck".toUpperCase();
        int countUpper = 0;
        password.toCharArray();

        for (int i = 0; i < password.length(); i++) {
             char charFromPassword = password.charAt(i);
             if (alfabet.contains(charFromPassword + "")){
                 countUpper++;
             }
        }
        if (countUpper==0){
            System.out.println("��� �������� � ������� �����");
            return;
        }

        char[] chars = password.toCharArray();
        int length = password.length();


    }
}
