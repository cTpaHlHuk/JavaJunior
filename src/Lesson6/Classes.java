package Lesson6;

public class Classes {
    public static void main(String[] args) {
        People p = new People();
        p.name = "Max";
        p.age = 15;
        p.gender = "male";
        p.getAge();
        System.out.println(p.getAge());


        System.out.println(p.getInfo(3));

        People.Say();
    }
}
