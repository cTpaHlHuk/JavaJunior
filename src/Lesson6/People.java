package Lesson6;

public class People {
    String name;
    int age;
    String gender;

    public int getAge(){
        return age;
    }

    public String getInfo(int type){
        switch (type){
            case 1:
                return name;
            case 2:
                return name + " " + age;
            case 3:
                return name + " " + age + " " + gender;
            default:
                return "Нужно вводить от 1 до 3";
        }
    }

    public static void Say(){
        System.out.println("Мы человечество");
    }
}
